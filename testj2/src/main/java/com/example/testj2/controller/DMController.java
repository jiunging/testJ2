package com.example.testj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DMController {

	@GetMapping("/dm")
	public String dm() {
		return "/DM";
	}
	
	
}
