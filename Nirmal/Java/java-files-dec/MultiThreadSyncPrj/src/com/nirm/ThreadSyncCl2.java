package com.nirm;

public class ThreadSyncCl2 extends Thread {

	public static void main(String[] args) {
		
		Table obj = new Table();
		
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(7);
				
			}
			
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(200);
			}
		};
		
		t1.start();
		t2.start();

	}

}
