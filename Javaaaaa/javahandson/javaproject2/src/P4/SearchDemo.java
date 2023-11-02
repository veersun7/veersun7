package P4;

import p1.Read;

public class SearchDemo {

public static void main(String[] args) {
		
		int arr[] = new int[10];
		int search = -1;
		int key;
		
		System.out.println("enter 10 number ------------");
	 for (int i = 0; i < arr.length; i++) {
		 System.out.println("enter element [ "+i+" ]");
		 arr[i] = Read.sc.nextInt();
		
		
	}
		System.out.println("------------------enter element to search");
		key = Read.sc.nextInt();
		
		System.out.println("Entered data --------------------");
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + "  ");
			  	
	}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] ==key ) {
				search = i;
			break;}
		}
		if (search ==-1) {
			System.out.println("element not found ");
		}
		else {
			System.out.println("element is present inf [" +search+" ]element");
		}
			
}
}

