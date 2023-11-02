package p5;

import p5.AddI;
import p5.AdditionInterface;

public class Demo1 {

	public static void main(String[] args) {
		
		AdditionInterface obj = new AddI(); // here reference is of AdditionInterface but object is of AddI class
		obj.setData(30, 8);
		obj.calc();
		obj.display();
		
	}
}
