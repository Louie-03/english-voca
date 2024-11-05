package com.english.voca.service;

import com.english.voca.domain.StudyLog;
import com.english.voca.domain.StudyType;
import com.english.voca.domain.Word;
import com.english.voca.dto.StudyLogNextResponse;
import com.english.voca.dto.StudyLogStartResponse;
import com.english.voca.exception.GlobalException;
import com.english.voca.repository.StudyLogRepository;
import com.english.voca.repository.WordRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
@Transactional
class StudyLogServiceTest {

	@Autowired
	StudyLogService studyLogService;

	@Autowired
	StudyLogRepository studyLogRepository;

	@Autowired
	WordRepository wordRepository;

	@Test
	void 학습_기록이_없는_경우_새로운_학습_기록을_생성한다() {
//		given
		boolean shuffle = false;
		boolean onlyBookMark = false;

//		when
		StudyLogStartResponse result = studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		assertThat(result.getWordId()).isEqualTo(1);
		assertThat(result.getWord()).isEqualTo("register");
		assertThat(result.getMean()).isEqualTo("등록하다");
		assertThat(result.isShuffle()).isEqualTo(shuffle);
		assertThat(result.isOnlyBookMark()).isEqualTo(onlyBookMark);

		StudyLog studyLog = studyLogRepository.findById(result.getStudyLogId())
				.orElseThrow(IllegalStateException::new);
		StudyLog afterStudyLog = studyLog.getAfterStudyLog();

		assertThat(studyLog.getBeforeStudyLog()).isNull();
		assertThat(afterStudyLog).isNotNull();
		assertThat(studyLog.isShuffle()).isEqualTo(shuffle);
		assertThat(studyLog.isOnlyBookMark()).isEqualTo(onlyBookMark);
		assertThat(studyLog.isNowStudying()).isTrue();
	}

	@Test
	void 학습_기록이_있는_경우_기존_학습_기록을_계속_진행한다() {
//		given
		boolean shuffle = false;
		boolean onlyBookMark = false;
		StudyLogStartResponse response = studyLogService.startStudy(shuffle, onlyBookMark);

//		when
		StudyLogStartResponse result = studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		assertThat(response).isEqualTo(result);
	}

	@Test
	void 진행했던_학습_기록이_있는_경우_이어서_학습을_진행한다() {
//		given
		boolean shuffle = false;
		boolean onlyBookMark = false;
		StudyLogStartResponse response = studyLogService.startStudy(shuffle, onlyBookMark);
		StudyLogNextResponse studyLogNextResponse = studyLogService.nextStudy(response.getStudyLogId(), StudyType.NEXT);

//		when
		StudyLogStartResponse result = studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		assertThat(result.getStudyLogId()).isEqualTo(studyLogNextResponse.getStudyLogId());
		assertThat(result.getWordId()).isEqualTo(studyLogNextResponse.getWordId());
		assertThat(result.getWord()).isEqualTo(studyLogNextResponse.getWord());
		assertThat(result.getMean()).isEqualTo(studyLogNextResponse.getMean());
		assertThat(result.isShuffle()).isEqualTo(studyLogNextResponse.isShuffle());
	}

	@Test
	void 마지막_학습_기록에서_다음_학습_기록을_진행할_경우_예외가_발생한다() {
//		given
		boolean shuffle = false;
		boolean onlyBookMark = true;
		StudyLogStartResponse response = studyLogService.startStudy(shuffle, onlyBookMark);
		StudyLogNextResponse studyLogNextResponse = studyLogService.nextStudy(response.getStudyLogId(), StudyType.NEXT);
		studyLogNextResponse = studyLogService.nextStudy(studyLogNextResponse.getStudyLogId(), StudyType.NEXT);
		studyLogNextResponse = studyLogService.nextStudy(studyLogNextResponse.getStudyLogId(), StudyType.NEXT);
		Long studyLogId = studyLogNextResponse.getStudyLogId();

//		then
		assertThatThrownBy(() -> studyLogService.nextStudy(studyLogId, StudyType.NEXT))
				.isInstanceOf(GlobalException.class)
				.hasMessage("학습을 모두 완료했습니다.");

	}

	@Test
	void 맨처음_학습_기록에서_이전_학습_기록을_진행할_경우_예외가_발생한다() {
//		given
		boolean shuffle = false;
		boolean onlyBookMark = false;
		StudyLogStartResponse response = studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		assertThatThrownBy(() -> studyLogService.nextStudy(response.getStudyLogId(), StudyType.PREVIOUS))
				.isInstanceOf(GlobalException.class)
				.hasMessage("더 이상 앞으로 갈 수 없습니다.");
	}

	@Test
	void 순서를_섞을_경우_임의의_순서를_가진_학습_기록이_생성되며_모든_단어가_학습_기록에_포함된다() {
//		given
		boolean shuffle = true;
		boolean onlyBookMark = false;

//		when
		studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		List<StudyLog> studyLogs = studyLogRepository.findAll();
		List<Word> words = wordRepository.findAll();
		Set<String> studyLogWords = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getWord())
				.collect(Collectors.toSet());

		int count = 0;
		assertThat(words.size()).isEqualTo(studyLogs.size());
		for (int i = 0; i < words.size(); i++) {
			assertThat(studyLogWords.contains(words.get(i).getWord())).isTrue();
			if(words.get(i).getId() == studyLogs.get(i).getWord().getId()) {
				count++;
			}
		}
		assertThat(count).isNotEqualTo(studyLogs.size());
	}

	@Test
	void 북마크한_단어만_학습한다() {
//		given
		boolean shuffle = false;
		boolean onlyBookMark = true;

//		when
		StudyLogStartResponse studyLogStartResponse = studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		List<StudyLog> studyLogs = studyLogRepository.findByOnlyBookMarkAndShuffle(onlyBookMark, shuffle);

		List<String> words = Arrays.asList("register", "considerable", "accessible", "informative");
		List<String> studyLogWords = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getWord())
				.collect(Collectors.toList());
		assertThat(studyLogWords).containsExactlyElementsOf(words);

		List<String> means = Arrays.asList("등록하다", "상당한", "접근할 수 있는", "유익한");
		List<String> studyLogMeans = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getMean())
				.collect(Collectors.toList());
		assertThat(studyLogMeans).containsExactlyElementsOf(means);

		List<Long> wordIds = Arrays.asList(1L, 3L, 4L, 7L);
		List<Long> studyLogWordIds = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getId())
				.collect(Collectors.toList());
		assertThat(studyLogWordIds).containsExactlyElementsOf(wordIds);

		for (StudyLog studyLog : studyLogs) {
			assertThat(studyLog.isShuffle()).isFalse();
			assertThat(studyLog.isOnlyBookMark()).isTrue();
		}
	}

	@Test
	void 순서를_섞고_북마크한_단어만_학습한다() {
//		given
		boolean shuffle = true;
		boolean onlyBookMark = true;

//		when
		StudyLogStartResponse studyLogStartResponse = studyLogService.startStudy(shuffle, onlyBookMark);

//		then
		List<StudyLog> studyLogs = studyLogRepository.findByOnlyBookMarkAndShuffle(onlyBookMark, shuffle);

		List<String> words = Arrays.asList("register", "considerable", "accessible", "informative");
		List<String> studyLogWords = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getWord())
				.collect(Collectors.toList());
		assertThat(studyLogWords).containsExactlyInAnyOrderElementsOf(words);

		List<String> means = Arrays.asList("등록하다", "상당한", "접근할 수 있는", "유익한");
		List<String> studyLogMeans = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getMean())
				.collect(Collectors.toList());
		assertThat(studyLogMeans).containsExactlyInAnyOrderElementsOf(means);

		List<Long> wordIds = Arrays.asList(1L, 3L, 4L, 7L);
		List<Long> studyLogWordIds = studyLogs.stream()
				.map(studyLog -> studyLog.getWord().getId())
				.collect(Collectors.toList());
		assertThat(studyLogWordIds).containsExactlyInAnyOrderElementsOf(wordIds);

		for (StudyLog studyLog : studyLogs) {
			assertThat(studyLog.isShuffle()).isTrue();
			assertThat(studyLog.isOnlyBookMark()).isTrue();
		}
	}

	// TODO: 학습기록 조회 시 순서 보장 어떻게 할지 고민
	// TODO: 테스트환경에서 osiv 동작하는지 확인
	// TODO: 개발환경에서 osiv 동작하는지 확인
	// TODO: 배포환경에서 osiv 동작하는지 확인
}
