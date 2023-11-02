package p1;

public class Demo1 {
 
	public static void main(String[] args) {
		System.out.println("Welcome to Java Core");
		// calling static method
		main();
		// calling non-static method
		Demo1 obj = new Demo1();
		obj.main1();
	}
	
	public static void main() {
		System.out.println("I am in normal main");
		
	}
	
	public void main1() {
		System.out.println("I am in main1");
	}
}

// when we want to print the content we need to give it under public static void.
// Anything given under public void will not get displayed
// we need to call whatever the method name is under 

