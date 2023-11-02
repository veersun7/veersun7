package com.nirm;

import java.util.Optional;

public class myOptionalClass {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		str[5] = "Hello";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
	
	if(checkNull.isPresent()) {
		System.out.println("string is not Null: "+ str[5]);
	}
	else {
		System.out.println("String is Null");
	}
	System.out.println(str[5]);
	
	
	}
	

}
