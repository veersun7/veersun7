package org.nirm;

public class MyFIClass implements sayable {

	@Override
	public void say(String msg) {
		System.out.println(msg);

	}

	public static void main(String[]args) {
		MyFIClass fiObj = new MyFIClass();
		fiObj.say("Welcome to Java 8 - Functional Interface");
		fiObj.saysomething();
		int num = fiObj.print();
		System.out.println("Number returned : "+num);
			
	
	}
	
	
}
