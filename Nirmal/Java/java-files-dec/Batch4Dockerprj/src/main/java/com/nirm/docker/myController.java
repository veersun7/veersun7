package com.nirm.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
		
	}

	@GetMapping("/world")
	public String helloWorld() {
		return"hello world";
	}
}
