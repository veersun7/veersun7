package com.nirm;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		System.out.println("You entered:"+a);
		
		System.out.println("Enter Your name:");
		String name = sc.next();
		
		System.out.println("Welcome  " +name);

	}

}
