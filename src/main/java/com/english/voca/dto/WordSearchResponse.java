package com.english.voca.dto;

import com.english.voca.domain.Word;
import lombok.Getter;

@Getter
public class WordSearchResponse {

	private Long id;
	private String word;
	private String mean;
	private boolean bookMark;

	public WordSearchResponse(Word word) {
		this.id = word.getId();
		this.word = word.getWord();
		this.mean = word.getMean();
		this.bookMark = word.isBookMark();
	}
}
