package com.nirm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

public class MyEnumExample {
	
	public static void main(String[]args) {
		
		try {
		List<String> myList = new ArrayList<String>();
	
		myList.add("HTML");
		myList.add("CSS");
		myList.add("Js");
		myList.add("React");
		myList.add("Java");
		myList.add("Spring");
		
		System.out.println("My list: " + myList);
		Enumeration<String> e = Collections.enumeration(myList);
		System.out.println("Enumeration over myList:");
		while (e.hasMoreElements())
			System.out.println("value:"+e.nextElement());
	}
		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown:"+e);
		}
		catch(NoSuchElementException e) {
			System.out.println("Exception thrown:"+e);
		}
	}
}
