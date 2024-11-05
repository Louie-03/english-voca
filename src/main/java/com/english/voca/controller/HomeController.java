package com.english.voca.controller;

import com.english.voca.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

	private final WordService wordService;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("words", wordService.searchWords());

		return "index";
	}
}
