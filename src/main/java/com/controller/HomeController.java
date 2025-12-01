package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.startup.StartService;

@Controller
public class HomeController {
	
	@Autowired
	private StartService service;
	
	@GetMapping("/home")
	public String homePage() {
		try {
			service.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
}