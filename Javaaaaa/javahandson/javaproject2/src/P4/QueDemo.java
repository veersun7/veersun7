package P4;

import p1.Read;
 
public class QueDemo {

	public static void main(String[] args) {
		
		int arr[] = new int [10];
		int front = -1;
		int rear = -1;
		int choice =0;
		
		do {
			System.out.println("1 insert 2 display 3 exit"); 
			choice = Read.sc.nextInt();
			switch (choice ) {
			case 1: {
				rear++;
				if (rear > 9) {
					System.out.println("Que is full");
					rear--;
				}
				else {
					System.out.println("enter value for que");
					arr[rear] = Read.sc.nextInt(); 
				}
					break;
			}
			case 2: {
				front++;
				if(front > rear) {
					front--;
					System.out.println("que is empty");
					
				}
				else
				{
					System.out.println(arr[front]);
					
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
		
	
