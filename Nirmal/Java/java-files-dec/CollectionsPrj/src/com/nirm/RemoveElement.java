package com.nirm;

import java.util.HashSet;

public class RemoveElement {
	 public static void main(String args[])
	    {
	        HashSet<String> setcolors = new HashSet<String>();
	        setcolors.add("red");
	        setcolors.add("blue");
	        setcolors.add("green");
	        setcolors.add("yellow");
	        System.out.println("HashSet: " + setcolors);
	        setcolors.remove("yellow");
 	        System.out.println(
	        "HashSet after removing elements: " + setcolors);
	    }
	}