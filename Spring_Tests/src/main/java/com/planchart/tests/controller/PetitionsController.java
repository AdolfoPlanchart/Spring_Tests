package com.planchart.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PetitionsController {

	/* url: /request_param?name=Adolfo */
	@GetMapping("/request_param")
	public ModelAndView FirstPetition(@RequestParam(name="name") String name) {
		ModelAndView mav = new ModelAndView("index");
		
		mav.addObject("name", name);
		
		return mav;
	}
	
	/* url: /path_param/Adolfo */
	@GetMapping("/path_param/{name}")
	public ModelAndView SecondPetition(@PathVariable(name="name") String name) {
		ModelAndView mav = new ModelAndView("index");
		
		mav.addObject("name", name);
		
		return mav;
	}
}
