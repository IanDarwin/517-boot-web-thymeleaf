package com.learningtree.spring.boot_data_thymeleaf;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  VideoCategoryController {
	
	@Autowired
	private VideoCategoryService service;
	
	@GetMapping("/genres")
	public String getAllCategories(Model model) {
		model.addAttribute("categories", service.getAllCategories());
		model.addAttribute("now", LocalDateTime.now());
		return "video_categories";
	}
}
