package com.nirm;

import java.util.Scanner;

public class LLMain {

	public static void main(String[] args) {
	LLImpl lnkList = new LLImpl();
	
	lnkList.head = null;
		
		Scanner in = new Scanner(System.in);
		
		do {
			
			
			System.out.println("-------Linked list Menu--------");
			System.out.println("1. Insert at the end of the Linked List");
			System.out.println("2. Insert at the beginning of the Linked List");
			System.out.println("3. Display the Linked List");
			System.out.println("4. Length");
			System.out.println("5. Exit");
		
			System.out.println("Enter your choice");
			int n = in.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter the value:");
				lnkList.head = lnkList.insertAtTheEnd(in.nextInt(), lnkList.head);
				break;
			case 2:
				System.out.println("Enter the value:");
				lnkList.head = lnkList.insertInBeg(in.nextInt(), lnkList.head);
				break;	
			case 3:
				lnkList.display(lnkList.head);
				break;
			case 4:
				System.out.println("No of nodes in Linked List = " + lnkList.length(lnkList.head));
				break;	
				
			case 5:
				System.exit(0);
				
			}
		
		System.out.println("press 1 to continue..");
		
		}while (in.nextInt()==1);
}
}
