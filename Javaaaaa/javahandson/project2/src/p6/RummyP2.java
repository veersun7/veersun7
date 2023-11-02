package p6;

public class RummyP2 extends Thread{
	RummyGame obj;

	public RummyP2(RummyGame obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for( int i=0; i<9; i++) {
			obj.f2();
		}
	}
}
