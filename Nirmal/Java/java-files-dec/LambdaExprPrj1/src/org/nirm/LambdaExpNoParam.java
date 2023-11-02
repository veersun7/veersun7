package org.nirm;

public class LambdaExpNoParam implements sayable {

	public static void main(String[] args) {
	 sayable s = () -> {
		 return "Message from say method - hi";
	 };
	 
	 System.out.println(s.say());

	}
	@Override
	public String say() {
		return null;
	}
}
