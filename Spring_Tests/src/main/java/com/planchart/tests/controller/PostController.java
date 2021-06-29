package com.planchart.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.planchart.tests.model.User;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@GetMapping("/form_example")
	public ModelAndView Form() {
		ModelAndView mav = new ModelAndView("form_example");
		
		mav.addObject("user", new User());
		
		return mav;
	}
	
	@PostMapping("/add_user")
	public ModelAndView FormResult(@ModelAttribute("user") User user) {
		ModelAndView mav = new ModelAndView("form_example_result");
		
		mav.addObject("user", user);
		
		return mav;
	}
	
}
