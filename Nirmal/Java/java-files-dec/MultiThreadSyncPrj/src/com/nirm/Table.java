package com.nirm;

public class Table {

	void printTable(int n) {
		for(int i=1;i<8;i++)
		System.out.println(n + "*" + i + "=" + n * i);
		try {
			Thread.sleep(400);;
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	
	}
	
}
