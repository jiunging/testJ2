package com.example.testj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class minsangController {
	
	@GetMapping("/")
	public String main() {
		return "/minsang";
	}

}
