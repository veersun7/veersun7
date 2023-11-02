package org.nirm;

public class MyHello implements Sayable {

	@Override
	public void sayHello() {
		System.out.println("Hello from Nirmal");

	}

	@Override
	public String myMessage(String msg) {
	
		return"Recd msg:"+ msg;
	}

}
