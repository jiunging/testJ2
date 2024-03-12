package com.example.testj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice")
public class HelloController {

	
	@GetMapping("/Hello")
	public String home() {
		
		return "/practice/Hello";
		
	}
}
