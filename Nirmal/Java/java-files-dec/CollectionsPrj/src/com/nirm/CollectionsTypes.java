package com.nirm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTypes {

	public static void main(String[] args) {
		
			
		
		  List lnklst = new LinkedList();
		  
		  lnklst.add("Element1"); lnklst.add("Element2"); lnklst.add("Element3");
		  lnklst.add("Element4"); lnklst.add("Element5");
		  
		  displayAll(lnklst);
		  
		  List fruitlist = new ArrayList();
		  
		  fruitlist.add("Apple"); fruitlist.add("Kiwi"); fruitlist.add("Cherry");
		  fruitlist.add("Guava"); fruitlist.add("Orange");
		  
			  
		  displayAll(fruitlist);
		 
		  
		  System.out.println("Map..."); Map<String, String> map1 = new HashMap();
		  
		  map1.put("Apple","Simla"); map1.put("Kiwi","NZ");
		  map1.put("Grapes","Nashik"); map1.put("Guava","Prayagraj");
		  
		  displayAll(map1.keySet()); displayAll(map1.values());
		  System.out.println("The place of origin: Kiwi" + map1.get("Kiwi"));
		  System.out.println("The place of origin: Guava" + map1.get("Guava"));
		 
		  //Sorted Map
		  SortedMap map2 = new TreeMap();
		  map2.put("one",  "Blue");
		  map2.put("two",  "Red");
		  map2.put("three",  "Green");
		  map2.put("four",  "Purple");
		  
		  displayAll(map2.keySet());
		  displayAll(map2.values());
		  
		  System.out.println("The value for Key one : " + map2.get("one"));
		  System.out.println("The value for key two : " + map2.get("two"));
		  
		  
		  System.out.println("The entrySet() of the map:"+map2.entrySet());
			
		  
		  //set
			
		System.out.println("collection - set");
			Set set1= new HashSet();
			set1.add("blue");
			set1.add("green");
			set1.add("yellow");
			
			
			System.out.println("Display set items :");
			displayAll(set1);
			
			System.out.println("Collection - Sorted Set");
			SortedSet treeSet1= new TreeSet();
			treeSet1.add("Lucknow");
			treeSet1.add("Dimapur");
			treeSet1.add("Chennai");
			treeSet1.add("Bhopal");
			
			
			System.out.println("Display sorted set items :");
			displayAll(treeSet1);
				
	}
		
		private static void displayAll(Collection col) {
			Iterator iter = col.iterator();
			while(iter.hasNext()) {
				String str = (String) iter.next();
				System.out.println(str + "");
			
			}
		
			}
		
}
