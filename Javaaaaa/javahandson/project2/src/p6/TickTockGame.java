package p6;

public class TickTockGame {

	// Main login should be under normal class and the thread should be created to play the game
	
	synchronized public void f1() {
		try {
			notify(); // this will remove the wait status of other thread
			// when there is multiple threads, we have to use notify all
			
			System.out.print("Tick - ");
			wait();
			
		}catch(Exception err) {
			System.out.println(err);
		}
		
	}
	
	synchronized public void f2() {
		try {
			notify(); // this will remove the wait status of other thread
			// when there is multiple threads, we have to use notify all
			
			System.out.println("Tock");
			wait();
			
		}catch(Exception err) {
			System.out.println(err);
		}
		
	}
	
}
