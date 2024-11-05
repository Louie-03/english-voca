package com.english.voca.service;

import com.english.voca.domain.Word;
import com.english.voca.dto.WordSearchResponse;
import com.english.voca.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class WordService {

	private final WordRepository wordRepository;

	public List<WordSearchResponse> searchWords() {
		List<Word> words = wordRepository.findAll();

		return words.stream()
				.map(WordSearchResponse::new)
				.collect(Collectors.toList());
	}

	public boolean editBookMark(Long id, boolean bookMark) {
		wordRepository.findById(id)
				.orElseThrow(IllegalStateException::new)
				.setBookMark(bookMark);
		return bookMark;
	}
}
