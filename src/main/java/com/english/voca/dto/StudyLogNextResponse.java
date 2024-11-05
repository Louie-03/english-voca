package com.english.voca.dto;

import com.english.voca.domain.StudyLog;
import lombok.Getter;

@Getter
public class StudyLogNextResponse {

	private Long studyLogId;
	private Long wordId;
	private String word;
	private String mean;
	private boolean shuffle;

	public StudyLogNextResponse(StudyLog afterStudyLog) {
		this.studyLogId = afterStudyLog.getId();
		this.wordId = afterStudyLog.getWord().getId();
		this.word = afterStudyLog.getWord().getWord();
		this.mean = afterStudyLog.getWord().getMean();
		this.shuffle = afterStudyLog.isShuffle();
	}
}
