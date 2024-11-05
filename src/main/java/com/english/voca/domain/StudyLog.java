package com.english.voca.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudyLog {

	@Id
	@SequenceGenerator(
			name = "STUDY_LOG_SEQ_GENERATOR",   // 식별자 생성기 이름
			sequenceName = "STUDY_SEQ",  // 데이터베이스에 등록되어있는 시퀀스 이름: DB에는 해당 이름으로 매핑된다.
			initialValue = 1,  // DDL 생성시에만 사용되며 시퀀스 DDL을 생성할 때 처음 시작하는 수를 지정
			allocationSize = 100  // 시퀀스 한 번 호출에 증가하는 수
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDY_LOG_SEQ_GENERATOR")
	private Long id;

	@JoinColumn
	@ManyToOne(fetch = FetchType.LAZY)
	private Word word;

	@JoinColumn
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "afterStudyLog")
	private StudyLog beforeStudyLog;

	@JoinColumn
	@OneToOne(fetch = FetchType.LAZY)
	private StudyLog afterStudyLog;

	private boolean shuffle;

	private boolean onlyBookMark;

	private boolean nowStudying;

	public StudyLog(Word word, boolean shuffle, boolean onlyBookMark, boolean nowStudying) {
		this.word = word;
		this.shuffle = shuffle;
		this.onlyBookMark = onlyBookMark;
		this.nowStudying = nowStudying;
	}

//	연관관계 메서드
	public void setBeforeStudyLog(StudyLog beforeStudyLog) {
		this.beforeStudyLog = beforeStudyLog;
		beforeStudyLog.afterStudyLog = this;
	}

	public void setNowStudying(boolean nowStudying) {
		this.nowStudying = nowStudying;
	}
}
