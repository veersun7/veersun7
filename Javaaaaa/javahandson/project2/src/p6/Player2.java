package p6;

public class Player2 extends Thread {

	TickTockGame obj;
	
	public Player2(TickTockGame obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			obj.f2();
		}
	}
}
