package p2;

import java.util.Scanner;

public class Add1 {
private Scanner sc ;

public Add1() {
	super();
	System.out.println("I am in constructor");
	sc = new Scanner(System.in);
}

public int getData() {
	return sc.nextInt();
}

public int calSum(int x, int y) {
	int z = x + y;
	return z;
}

public void displaySum(int sum) {
	System.out.println("Sum is " + sum);
}
	
}