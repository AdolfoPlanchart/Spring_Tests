package com.planchart.tests.controller;

import java.util.ArrayList;
import java.util.List;

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
		List<User> list = new ArrayList<User>();
		list.add(new User(
					"Adolfo",
					"Planchart",
					"aplanchart27@gmail.com"
				));
		list.add(new User(
				"Nathalia",
				"Aguilera",
				"nathaguilera1999@gmail.com"
			));
		model.addAttribute("users", list);
		return "view_one";
	}
	
	@GetMapping("/MethodTwo")
	public ModelAndView MethodTwo() {
		ModelAndView mav = new ModelAndView("view_two");
		
		mav.addObject("user", new User("Isabella","Planchart","isabellaplanchart@gmail.com"));
		
		return mav;
	}
	
}
