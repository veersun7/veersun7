package com.nirm;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {


		Stack s = new Stack();
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n---------Stack Menu------");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.Display");
			System.out.println("4.Exit");		

			System.out.println("Enter your choice");
			switch (in.nextInt())
			{
			case 1:
				System.out.println("Enter the value to push..");
				s.push(in.nextInt());
				break;
			case 2:
				System.out.println("Popped element: "+s.pop());
				break;
			case 3:
				System.out.println("Stack is: ");
				s.display();
				break;
			case 4:
				System.exit(0);
				break;
				default:
					System.out.println("\nWrong choice");
					
				break;
			}
			System.out.println("Press 1 to continue...:");
		}while(in.nextInt()==1);
	}

}
