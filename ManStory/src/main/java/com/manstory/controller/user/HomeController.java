package com.manstory.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("manstory")
	public String getMethodName(Model model) {
		
		return "user/Home";
	}
	
}
