package com.nirm;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
	
		Queue q = new Queue();

		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n---------Queue Menu------");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");		

			System.out.println("Enter your choice");
			switch (in.nextInt())
			{
			case 1:
				System.out.println("Enter the value to enqueue..");
				q.enqueue(in.nextInt());
				break;
			case 2:
				System.out.println("Dequeued element: "+q.dequeue());
				break;
			case 3:
				q.display();
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
