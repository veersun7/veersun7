package p2;

import java.util.Scanner;

public class Add2 {
	
	int num1, num2, num3;
	
	private Scanner sc;

	public Add2() {
		super();
		System.out.println("I am in constructor");
		sc = new Scanner(System.in);
	}
	
	public void getData() {
		this.num1 = sc.nextInt() ;
		this.num2 = sc.nextInt();
		
	}
	
	public void calSum() {
		this.num3 = this.num1+this.num2;
	}
	
	public void displaySum() {
		System.out.println("Sum is = " + this.num3);
	}
	
}

