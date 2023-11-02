package com.nirm;

import java.util.Scanner;

public class javaArray {

	public static void main(String[] args) {
	int[] marks = new int[5];
	

	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter marks of 5 students:");
	for(int i=0;i<5;i++) {
		marks[i] = in.nextInt();
	}
		System.out.println("Marks of the third student: " +marks[2]+"\nAll marks:");
		for(int i=0;i<5;i++)
			System.out.print(marks[i]+" ");
	}
	}


