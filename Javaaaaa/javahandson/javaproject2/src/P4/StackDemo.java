package P4;

import p1.Read;

public class StackDemo {

public static void main(String[] args) {
		
		int arr[] = new int [10];
		int sp = -1;
		int choice =0;
		
		do {
			System.out.println("1 insert 2 display 3 exit"); 
			choice = Read.sc.nextInt();
			switch (choice ) {
			case 1: {
				sp++;
				if (sp > 9) {
					System.out.println("stack is full");
					sp--;
				}
				else {
					System.out.println("enter value to push");
					arr[sp] = Read.sc.nextInt(); 
				}
					break;
			}
			case 2: {
			
				if(sp<0) {
					
					System.out.println("stack is empty");
					
				}
				else
				{
					System.out.println("pop vaue is "+arr[sp]);
					sp--;
				}
				break;
			}
	
				
			case 3:
				System.out.println("program over");
				break;
				default:
				System.out.println("invalid choice");
							
				}
			
			}while (choice != 3);
		
			}
		}

