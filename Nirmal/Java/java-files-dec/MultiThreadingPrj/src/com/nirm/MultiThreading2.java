package com.nirm;

public class MultiThreading2 implements Runnable {

	@Override
	public void run() {
				try {
			System.out.println(" Runnable - Thread started " + Thread.currentThread().getId());
		}
			catch (Exception e) {
				
				System.out.println("Exception caught"+e);
			}
			}
}
		