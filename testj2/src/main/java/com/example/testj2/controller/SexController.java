package com.example.testj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sex")
public class SexController {

	@GetMapping("/")
	public String sex() {
		return "/sex";
	}
}
