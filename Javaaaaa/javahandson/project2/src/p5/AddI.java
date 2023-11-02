package p5;

public class AddI implements AdditionInterface{

	int num1;
	int num2;
	public int sum;
	
	@Override
	public void setData(int x, int y) {
		// TODO Auto-generated method stub
		this.num1 = x;
		this.num2 = y;
	}
	@Override
	public void calc() {
		// TODO Auto-generated method stub
		this.sum = this.num1+this.num2;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.sum);	
	}
	// using getter and setter here:
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
}
