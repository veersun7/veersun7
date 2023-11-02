package org.nirm;

public class LambdaExpr1 implements playable{

	public static void main(String[] args) {
		String instrument = "Piano";
		// without lambda expression
		System.out.println("Without lambda expresssion");
		playable p = new playable() {
			public void play() {
				System.out.println("I Play " + instrument);
			}
		};
p.play();
	
String instrument2 = "Harmonica";
	
	//with lambda expression
	System.out.println("With lambda expresssion");
	playable p1=()->{
		System.out.println("I Play " + instrument2);	
	};
	p1.play();
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
