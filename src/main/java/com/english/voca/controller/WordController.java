package com.english.voca.controller;

import com.english.voca.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/words")
@RestController
public class WordController {

	private final WordService wordService;

	@PutMapping("/{id}")
	public Map<String, Boolean> editBookMark(@PathVariable(name = "id") Long id, @RequestBody Map<String, Boolean> payload) {
		return Collections.singletonMap("bookMark", wordService.editBookMark(id, payload.get("bookMark")));
	}

}
