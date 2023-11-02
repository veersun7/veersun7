package com.nirm;

public class Queue {

	int[]arr;
	int front;
	int rear;
	
	Queue (){
		front = rear = -1;
		arr = new int[8];
	}
	
	boolean isEmpty() {
		if((front ==-1) || (front > rear))
		return true;
		return false;
		
	}
	void enqueue (int x)
	{
	if(front == -1)
		front++;
	if (rear ==arr.length -1)
		System.out.println("Queue full");
	else
		arr[++rear] = x;
	}
	
	int dequeue() {
		int x = -1;
		if(isEmpty())
			System.out.println("Queue empty");
		else
			x=arr[front++];
			if(rear ==0)
				rear--;
		
		return x;
		
	}
		
		void display()
		{
			System.out.println("The queue is......");
		for(int i = front;i<=rear;i++)
		{
			if (i==front)
				System.out.print("front ("+i+")-->");
			System.out.print(arr[i] + " ");
			if (i == rear)
				System.out.println("<--("+i+")rear");
		}
	
		System.out.println();
		
		}
		}

