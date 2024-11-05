package com.english.voca.service;

import com.english.voca.domain.StudyLog;
import com.english.voca.domain.StudyType;
import com.english.voca.domain.Word;
import com.english.voca.dto.StudyLogNextResponse;
import com.english.voca.dto.StudyLogStartResponse;
import com.english.voca.exception.GlobalException;
import com.english.voca.repository.StudyLogRepository;
import com.english.voca.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class StudyLogService {

	private final StudyLogRepository studyLogRepository;
	private final WordRepository wordRepository;

	public StudyLogStartResponse startStudy(boolean shuffle, boolean onlyBookMark) {

		List<StudyLog> findStudyLogList = studyLogRepository
				.findByOnlyBookMarkAndShuffle(onlyBookMark, shuffle);
		if (!findStudyLogList.isEmpty()) {
			StudyLog nowStudyingLog = studyLogRepository.findByOnlyBookMarkAndShuffleAndNowStudying(
					onlyBookMark, shuffle, true);
			return new StudyLogStartResponse(nowStudyingLog, shuffle, onlyBookMark);
		}

		List<Word> words;
		if (onlyBookMark) {
			words = wordRepository.findByBookMark(true);
		} else {
			words = wordRepository.findAll();
		}

		if (words.isEmpty()) {
			throw new IllegalStateException("단어가 존재하지 않습니다.");
		}

		if (shuffle) {
			Collections.shuffle(words);
		}

		List<StudyLog> studyLogs = new ArrayList<>();
		for (Word word : words) {
			studyLogs.add(new StudyLog(word, shuffle, onlyBookMark, false));
		}

		setBeforeStudyLogs(studyLogs);

		studyLogs.get(0).setNowStudying(true);

		studyLogRepository.saveAll(studyLogs);

		return new StudyLogStartResponse(studyLogs.get(0), shuffle, onlyBookMark);
	}

	public StudyLogNextResponse nextStudy(Long id, StudyType studyType) {
		StudyLog nowStudyLog = studyLogRepository.findById(id)
				.orElseThrow(IllegalStateException::new);

		if (!nowStudyLog.isNowStudying()) {
			throw new IllegalStateException("현재 학습중인 단어가 아닙니다.");
		}

		StudyLog returnStudyLog;
		if (studyType == StudyType.NEXT) {
			returnStudyLog = nowStudyLog.getAfterStudyLog();
			if (returnStudyLog == null) {
				studyLogRepository.deleteByOnlyBookMarkAndShuffle(nowStudyLog.isOnlyBookMark(), nowStudyLog.isShuffle());

				String message = "학습을 모두 완료했습니다.";
				throw new GlobalException(message);
			}
		} else {
			returnStudyLog = nowStudyLog.getBeforeStudyLog();
			if (returnStudyLog == null) {
				String message = "더 이상 앞으로 갈 수 없습니다.";
				throw new GlobalException(message);
			}
		}
		nowStudyLog.setNowStudying(false);
		returnStudyLog.setNowStudying(true);
		return new StudyLogNextResponse(returnStudyLog);
	}

	private void setBeforeStudyLogs(List<StudyLog> studyLogs) {
		for (int i = 1; i < studyLogs.size(); i++) {
			StudyLog studyLog = studyLogs.get(i);
			studyLog.setBeforeStudyLog(studyLogs.get(i - 1));
		}
	}
}
