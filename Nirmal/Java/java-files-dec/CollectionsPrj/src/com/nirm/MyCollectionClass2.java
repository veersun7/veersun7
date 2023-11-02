package com.nirm;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;

public class MyCollectionClass2 {
	public static void mail(String[]args) {
		String[]array1 = {"A","B", "c", "D", "E"};
		List myList = new ArrayList();
		for(int i=0;i<array1.length;i++) {
			myList.add(array1[i]);
		}
		ListIterator liter = myList.listIterator();
		
		System.out.println("Before reversal....");
		while (liter.hasNext()) {
			System.out.println(liter.next());
		}
		Collections.reverse(myList);
		
		System.out.println("After reversal....");
		liter = myList.listIterator();
		while (liter.hasNext()) {
			System.out.println(liter.next());
		}
	
	}
	

}
