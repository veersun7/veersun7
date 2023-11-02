package P2;

import p1.Read;

public class Arithmetic {

	
		int num1;
		int num2;
		int num3;
		
		public void readm() {
			System.out.println("enter two number ");
			num1 = Read.sc.nextInt();
			num2 = Read.sc.nextInt();
					
		}
		public void cal() {
			
		}
		
		public void display() {
			System.out.println("num1 = " + num1 +" num2 = " + num2 + " num3 = " +num3);
		}
}
