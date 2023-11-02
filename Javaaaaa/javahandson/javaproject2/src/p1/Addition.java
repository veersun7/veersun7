package p1;

public class Addition {
	int num1;
	int num2;
	int num3;
	
	public void readm() {
		System.out.println("enter two number ");
		num1 = Read.sc.nextInt();
		num2 = Read.sc.nextInt();
				
	}
	public void cal() {
		num3 = num1 + num2;
	}
	
	public void display() {
		System.out.println("num1 = " + num1 +" num2 = " + num2 + " num3 = " +num3);
	}

}
