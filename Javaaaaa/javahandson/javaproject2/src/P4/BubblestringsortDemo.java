package P4;

import p1.Read;

public class BubblestringsortDemo { 
	public static void main(String[] args) {
		
		String[]arr = new String[10];
		String temp="";
		System.out.println("please enter 10 name for bubble sort");
		System.out.println("--------------xx-----------");
		for(int i = 0; i < 10; i++) {
			System.out.println("enter element [ " +i +"]");
			arr[i]= Read.sc.nextLine();
			
		}
		System.out.println("-----------xx------------");
		System.out.println("----------before sorted Data--------------");
		for(int i = 0; i< 9 ; i++) {
			System.out.print(arr[i] + "  ");
			
		}
		System.out.println();
		
		for(int i = 0;i<9; i++) {
			
			for(int j =0 ; j <(9-i) ;j++) {
				
				if(arr[j].compareTo(arr[j+1]) < 0) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					
				}
				
			} // for j loop
			
		} // for i loop
		
		System.out.println("---------------sorted Data ----------------");
		for(int i = 0; i <10 ; i++) {
			System.out.print(arr[i] + "  ");
			
		}
		System.out.println();
		
	}

	}


