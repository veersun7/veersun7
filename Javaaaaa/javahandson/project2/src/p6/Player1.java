package p6;

public class Player1 extends Thread {

	TickTockGame obj;
	
	public Player1(TickTockGame obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			obj.f1();
		}
	}
}
	