package p6;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
			
		ThreadDemo obj = new ThreadDemo();
		ThreadDemo obj1 = new ThreadDemo("Infosys", 20);
		ThreadDemo obj2 = new ThreadDemo("CTS", 25);
		
		System.out.println("I am in main");
		
		 obj.start();
		 obj1.start();
		 obj2.start();
		 obj.join();
		 obj1.join();
		 obj2.join();
		
	}
}
