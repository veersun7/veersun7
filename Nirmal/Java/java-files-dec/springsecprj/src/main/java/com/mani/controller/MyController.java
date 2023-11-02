package com.mani.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Everyone - Happy New Year 2023";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String sayHNY() {
		return "Happy New Year 2023";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome - Happy New Year 2023";
	}
}
