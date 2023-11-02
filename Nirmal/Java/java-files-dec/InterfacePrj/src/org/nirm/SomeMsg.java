package org.nirm;

public class SomeMsg implements Sayable {

	@Override
	public void sayHello() {
		System.out.println("This is a message from the second class");
	}

	@Override
	public String myMessage(String msg) {
		System.out.println("From the class SomeMsg: " + msg);
		return null;
	}

	}
