package com.nirm;

public class StringIndexOutOfBounds {

	public static void main(String[] args) {
	
		try {
		String a = "This is a string";
		
		char c= a.charAt(20);
		System.out.println(c);
	}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
