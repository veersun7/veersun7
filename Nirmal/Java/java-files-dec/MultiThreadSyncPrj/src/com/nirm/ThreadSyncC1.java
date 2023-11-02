package com.nirm;

public class ThreadSyncC1 {

	public static void main(String[] args) {
	
		Table tableObj = new Table();
		MyThread1 t1 = new MyThread1(tableObj);
		
		t1.start();

	}

}
