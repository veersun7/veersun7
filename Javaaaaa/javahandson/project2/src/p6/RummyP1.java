package p6;

public class RummyP1 extends Thread{
	RummyGame obj;

	public RummyP1(RummyGame obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for( int i=0; i<9; i++) {
			obj.f1();
		}
	}
}
