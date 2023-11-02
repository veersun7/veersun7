package P4;

import p1.Read;

public class SelsortDemo {
	
	public static void main(String[] args) {
		
		int arr[]=new int[10];
				int temp = 0;
				System.out.println("Please enter 10 numbers");
				System.out.println("-----------xx----------");
				for(int i = 0;i<10;i++) {
					System.out.println("enter element [ "+i +"]");
					arr[i]=Read.sc.nextInt();
					
				}
				System.out.println("----------------xx--------------");
				System.out.println("------------before sorted Data-----------");
					for(int i = 0; i < 10 ; i++) {
						System.out.println(arr[i] + "");
						
					}
					
					System.out.println();
					
					for(int i = 0;i<10; i++) {
						
						for(int j =i+1 ; j <10 ;j++) {
							
	// we can change the below to less than if we need the values from desc to asc order	
							
							if(arr[i] > arr[j]) {
								temp = arr[i];
								arr[i] = arr[j];
								arr[j]= temp;
								
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
