package com.nirm;

import java.util.Optional;

public class MyOptionalCl2 {
	
	public static void mail(String[] args) {
		
		Optional<String> emptyGender = Optional.empty();
		Optional<String> gender = Optional.of("Male");
	
	if (gender.isPresent()) {
		System.out.println("Gender value available" + gender);
	}
	else {
		System.out.println("Missing Gender value");
	}
	gender.ifPresent(g->System.out.println("In gender optional value is available"));
	
	emptyGender.ifPresent(g-> System.out.println("in emptyGender optional value is available"));
	}

}
