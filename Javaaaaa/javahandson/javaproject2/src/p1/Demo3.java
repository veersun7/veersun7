package p1;

import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
		
	int n1; //declaration of n1 variable
	int n2; //declaration of n2 variable
	int n3; //declaration of n3 variable
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter number 1");
	n1 = sc.nextInt();
	System.out.println("enter number 2");
	n2 = sc.nextInt();
	
	n3 = n1 + n2;
	System.out.println(n3);
	System.out.println("n1 = "+n1 + "n2 = "+n2 + "sum = "+n3);
	n3 = n1 - n2 ;
	System.out.println("n1 = "+n1 + "n2 = "+n2 + "subtraction = "+n3);
}
	
			
	
}
