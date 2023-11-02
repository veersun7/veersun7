package p4;
import java.util.*;

public class ListDemo1 {
	
	public static void main(String[] args) {
		List <Integer> a1 = Collections.synchronizedList(new LinkedList<>());
		a1.add(10);
		System.out.println(a1);
		
		Integer[] arr1 = {5,10,15,20,25};
		Integer[] arr2 = {20,40,15,60,85};
		
		List <Integer> a2 = Arrays.asList(arr1);
		List <Integer> a3 = new ArrayList<>(Arrays.asList(arr2));
		
		System.out.println(a2);
		System.out.println(a3);
		
			// To add one collections into another collections
//		a3.addAll(a2);
//		System.out.println(a3);
		
			// How to remove one collection from another collection
			// When we remove common element will be removed
		
//		a3.removeAll(a2);
//		System.out.println(a3);
	
			//How to retain common elements
	
//		a3.retainAll(a2);
//		System.out.println(a3);
			
		// How to convert array list to arrays back
		Integer[] arr3 = a3.toArray(new Integer[a3.size()]);
		for (Integer x : arr3) {
			System.out.println(x);
		}
	}

}
