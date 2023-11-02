package P2;

public class EnDemo {

	private int a1 = 10;
	int a2 = 20;
	protected int a3 = 30;
	public int a4 = 40;
	
	private void f1() {
		System.out.println("I am in f1" + a1);
		
	}
	
	void f2() {
		System.out.println("I am in f2");
	}
	
	protected void f3() {
		System.out.println("I am in f3");
		f1();
		
	}
	
	public void f4() {
		System.out.println("I am in f4");
		f1();
		f2();
		f3();
		
	}
}
