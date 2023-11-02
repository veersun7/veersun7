package p6;

public class Demo3 {
	
	public static void main(String[] args) {
		
		RummyGame obj = new RummyGame();
		RummyP1 p1 = new RummyP1(obj);
		RummyP2 p2= new RummyP2(obj);
		RummyP3 p3= new RummyP3(obj);
		
		p1.start();
		p2.start();
		p3.start();
	}
}
