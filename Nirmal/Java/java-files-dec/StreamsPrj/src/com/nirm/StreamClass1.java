package com.nirm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamClass1 {

	public static void main(String[] args) {
		
			List<String> memberNames = new ArrayList<String>();
			
			memberNames.add("Ramesh");
			memberNames.add("Abhinav");
			memberNames.add("Mukesh");
			memberNames.add("Aman");
			memberNames.add("Rahul");
			memberNames.add("Yana");
			memberNames.add("Lokesh");
			
			
			//Stream.filter()
			memberNames.stream().filter((s)->s.startsWith("A"))
			.forEach(System.out::println);
		
			//Stream.map()
			System.out.println("--------Stream map()--------");
			memberNames.stream().filter((s) -> s.endsWith("l"))
			.map(String::toUpperCase)	
			.forEach(System.out::println);
			
			//Stream.sorted()
			System.out.println("--------Stream sorted()--------");
			memberNames.stream().sorted()
			.map(String::toLowerCase)
			.forEach(System.out::println);
			
			//Terminal method --- stream.collect()
			
			System.out.println("---------stream.collect()--------");
			List<String>memNamesInUpperCase =
			memberNames.stream().sorted()
			.map(String::toUpperCase).collect(Collectors.toList());
	
	System.out.print("Sorted member names in uppercase..\n"+ memNamesInUpperCase);
		//Terminal method --- stream.match()
	System.out.println("---------stream.match()--------");
	boolean matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("B"));
	System.out.print("If (a)Name/Names starting with r....."+  matchedResult);
	
	//Terminal method --- stream.count()
		System.out.println("---------stream.count()--------");
		long totalMatched  = memberNames.stream().filter((k) -> k.startsWith("R")).count();
		System.out.print("Count of names Starting with R: "+  totalMatched);
	//Terminal method - stream reduce()
		
		System.out.println("---------stream.reduce()--------");
		Optional<String>reducedString = memberNames.stream().reduce((s1,s2)->s1+"#"+s2);
	reducedString.ifPresent(System.out::print);
	}
	

	}


