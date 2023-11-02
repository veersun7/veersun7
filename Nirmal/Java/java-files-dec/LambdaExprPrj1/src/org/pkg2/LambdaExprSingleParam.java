package org.pkg2;

public class LambdaExprSingleParam implements sayable {

	public static void main(String[] args) {
		
		sayable s1 = (name)->{
			return ("Message from say method - Hi" + name);
		};
		
		System.out.println(s1.say("Everyone"));

	sayable s2 = name->{
		return"Message without param in breakets - Hi " + name;
	};
	
	System.out.println(s2.say("October cohort"));
	}
	@Override
	public String say(String name) {
				return null;
	}

}
