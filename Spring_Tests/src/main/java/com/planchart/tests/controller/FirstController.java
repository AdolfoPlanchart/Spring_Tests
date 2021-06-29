package com.planchart.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FirstController {

	@GetMapping("/MethodOne")
	public String MethodOne() {
		return "view_one";
	}
	
	@GetMapping("/MethodTwo")
	public ModelAndView MethodTwo() {
		return new ModelAndView("view_two");
	}
	
}
