package com.github.pappuraj.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("data","PAPPURAJa");
		return "about";
	}

}
