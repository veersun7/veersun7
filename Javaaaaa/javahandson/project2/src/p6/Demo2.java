package p6;

public class Demo2 {

	public static void main(String[] args) {
		TickTockGame obj = new TickTockGame();
		
		Player1 p1 = new Player1(obj);
		Player2 p2 = new Player2(obj);
		
		p1.start();
		p2.start();
		
	}
}
