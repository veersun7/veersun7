package p4;

import java.util.*;
import java.util.stream.Collectors;
public class SetDemo2 {
	
public static void main(String[] args) {
		
//		Set<Integer> set1 =  Collections.synchronizedSet(new HashSet<>());
		
		Integer[] arr1 = {10,98,87,12};
		Integer[] arr2 = {25,87,15,12,86};
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1)); // asList can be used for list or set
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2)); // asList can be used for list or set

		System.out.println(set1);
		System.out.println(set2);

		//To add one collection to another 
//		set1.addAll(set2);
//		System.out.println(set1);
		//Remove one collection from another
		
//		set1.removeAll(set2);
//		System.out.println(set1);
		
		//Retain common element
//		set1.retainAll(set2);
//		System.out.println(set1);
		
		//Convert set back to array
		
		Integer[] arr3 = set2.toArray(new Integer[set2.size()]);
		for(Integer x : arr3) {
			System.out.println(x);
		}
		
	}

}