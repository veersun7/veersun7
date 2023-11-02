package p6;

import java.util.*;

public class RummyGame {

	String cards [] = {"King","Queen","Jack","Ace","2","3",	"4","5","6","7","8","9","10","Joker1","Joker2"};
	List <String> main;
	List <String> p1;
	List <String> p2;
	List <String> p3;
	int flag = 0;
	int x = 0;
	int y = 0;
	int z = 0;
	
	public RummyGame() {
		super();
		this.main = new Vector<>(Arrays.asList(cards));
		Collections.shuffle(main);
		this.p1 = new Vector<>();
		this.p2 = new Vector<>();
		this.p3 = new Vector<>();
		
		for (int i = 0; i < main.size(); i++) {
			
			p1.add(main.get(i++));
			p2.add(main.get(i++));
			p3.add(main.get(i));
		}
	}
	
	synchronized public void f1() {
		try {
			
			if (flag == 0) {
				notifyAll();
				System.out.println("Player1 - "+ p1.get(x++));
				flag = 1;
				wait();
				
			}else {
				wait();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	synchronized public void f2() {
		try {
			
			if (flag == 1) {
				notifyAll();
				System.out.println("Player2 - "+ p2.get(y++));
				flag = 2;
				wait();
				
			}else {
				
				wait();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	synchronized public void f3() {
		try {
			
			if (flag == 2) {
				notifyAll();
				System.out.println("Player3 - "+ p3.get(z++));
				flag = 0;
				wait();
				
			}else {
				wait();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

