package com.nirm;

public class MultiThreading1 extends Thread {

	public void run() {
		try {
		System.out.println("Thread started " + Thread.currentThread().getId());
	}
		catch (Exception e) {
			
			System.out.println("Exception caught"+e);
		}
		}
	public static void main(String[] args) {
		
		int n = 10;
		for (int i=0;i<=n; i++)
		{
		MultiThreading1 threadObj = new MultiThreading1();
		threadObj.start();
		//System.out.println("Thread started"+ threadObj.currentThread());
	}

}
}
