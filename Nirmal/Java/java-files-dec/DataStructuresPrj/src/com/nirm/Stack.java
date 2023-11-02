package com.nirm;

public class Stack {


	int []a;
	int top;

	Stack(){
		a= new int[10];
		top=-1;
	}
	void push(int x) {

		if (top == a.length -1) {
			System.out.println("Stack full - overflow");

		}
		else
		{
			//		top++;
			a[++top] = x;
		}

	}

	int pop() {

		if(top == -1) {
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			//		int y = a[top--];
			//		top--;
			return a[top--];
		}
	}
	void display() {
		for(int i=top;i>=0;i--) {
			if (i==top)
				System.out.println(a[i] + "<--top ");
			else
				System.out.println(a[i]);		
			System.out.println();
		}
	}
}
