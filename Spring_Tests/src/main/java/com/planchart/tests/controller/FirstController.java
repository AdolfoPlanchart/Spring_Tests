package com.planchart.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.planchart.tests.model.User;

@Controller
@RequestMapping("/")
public class FirstController {

	@GetMapping("/MethodOne")
	public String MethodOne(Model model) {
		model.addAttribute("user", new User("Adolfo","Planchart","aplanchart27@gmail.com"));
		return "view_one";
	}
	
	@GetMapping("/MethodTwo")
	public ModelAndView MethodTwo() {
		ModelAndView mav = new ModelAndView("view_two");
		
		mav.addObject("user", new User("Isabella","Planchart","isabellaplanchart@gmail.com"));
		
		return mav;
	}
	
}
