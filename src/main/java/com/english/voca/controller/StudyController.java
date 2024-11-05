package com.english.voca.controller;

import com.english.voca.domain.StudyType;
import com.english.voca.dto.StudyLogCreateRequest;
import com.english.voca.dto.StudyLogNextResponse;
import com.english.voca.dto.StudyLogStartResponse;
import com.english.voca.service.StudyLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/study")
@Controller
public class StudyController {

	private final StudyLogService studyLogService;

	@GetMapping("/start")
	public String startStudy(StudyLogCreateRequest request, Model model) {
		StudyLogStartResponse response = studyLogService.startStudy(request.isShuffle(), request.isOnlyBookMark());

		model.addAttribute("studyLogId", response.getStudyLogId());
		model.addAttribute("wordId", response.getWordId());
		model.addAttribute("word", response.getWord());
		model.addAttribute("mean", response.getMean());
		model.addAttribute("shuffle", response.isShuffle());
		model.addAttribute("onlyBookMark", response.isOnlyBookMark());
		return "study";
	}

	@ResponseBody
	@GetMapping("/{id}")
	public StudyLogNextResponse nextStudy(@PathVariable("id") Long id, @RequestParam("studyType") StudyType studyType) {
		return studyLogService.nextStudy(id, studyType);
	}
}
