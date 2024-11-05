package com.english.voca.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Word {

	@Id
	@SequenceGenerator(
			name = "WORD_SEQ_GENERATOR",   // 식별자 생성기 이름
			sequenceName = "WORD_SEQ",  // 데이터베이스에 등록되어있는 시퀀스 이름: DB에는 해당 이름으로 매핑된다.
			initialValue = 1,  // DDL 생성시에만 사용되며 시퀀스 DDL을 생성할 때 처음 시작하는 수를 지정
			allocationSize = 100  // 시퀀스 한 번 호출에 증가하는 수
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WORD_SEQ_GENERATOR")
	private Long id;

	private String word;

	private String mean;

	private boolean bookMark;

	public Word(String word, String mean, boolean bookMark) {
		this.word = word;
		this.mean = mean;
		this.bookMark = bookMark;
	}

	public void setBookMark(boolean bookMark) {
		this.bookMark = bookMark;
	}
}
