package com.nirm;

public class ThreadMain extends MultiThreading2 {

	public static void main(String[] args) {
		int n  = 8;
		for(int i=1;i<=n;i++)
		{
			MultiThreading2 t1 = new MultiThreading2();
			t1.run();
		
		}
		

	}

}
