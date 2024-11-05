package com.english.voca.dto;

import com.english.voca.domain.StudyLog;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class StudyLogStartResponse {

	private Long studyLogId;
	private Long wordId;
	private String word;
	private String mean;
	private boolean shuffle;
	private boolean onlyBookMark;

	public StudyLogStartResponse(StudyLog studyLog, boolean shuffle, boolean onlyBookMark) {
		this.studyLogId = studyLog.getId();
		this.wordId = studyLog.getWord().getId();
		this.word = studyLog.getWord().getWord();
		this.mean = studyLog.getWord().getMean();
		this.shuffle = shuffle;
		this.onlyBookMark = onlyBookMark;
	}


}
