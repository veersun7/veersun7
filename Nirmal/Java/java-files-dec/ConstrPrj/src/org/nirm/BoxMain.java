package org.nirm;

public class BoxMain {

	public static void main(String[] args) {
		Box myBox = new Box(10);
		Box b1 = new Box(4,5,6);
		Boxcolor coloredBox = new Boxcolor(5,6,7,"Yellow");
		System.out.println(myBox + "\n" + b1);
		System.out.println("Volume of b1:"+ b1.volume() );
		Boxwt bw = new Boxwt(5,6,7,"Green",1.2F);
		System.out.println("Volume of bw:"+ bw.volume() );
		System.out.println("Wt of bw:"+ bw.volume()* bw.getDensity() );
//		myBox.show();
//		myBox.setData(5,6,7);
//		System.out.println("After set data...");
//		myBox.show();

//		myBox.setData(12);
//		System.out.println("After set data to  12...");
//		myBox.show();
//		b1.show();
	}

}
