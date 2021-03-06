package com.coffee.maqzar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model){
		
		model.addAttribute("greeting", "Welcome to MAQZAR");
		model.addAttribute("tagline", "The web application for administration.");
		
		return "welcome";
	}
}
