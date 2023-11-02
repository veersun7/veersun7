package org.nirm;

public class MyMain {
	public static void main(String[] args) {
		MyHello helloObj = new MyHello();
		
		helloObj.sayHello();
		System.out.println(helloObj.myMessage("Welcome to STS"));
		
		SomeMsg obj2 = new SomeMsg();
		obj2.sayHello();
		obj2.myMessage("Obj2 calling");
		
		ClassNirmal1 cn = new ClassNirmal1();
		cn.sayHello();
	}
}
