package p2;

public class Demo5 {
public static void main(String[] args) {
	Add1 obj = new Add1();
	int a1 = obj.getData();
	int a2 = obj.getData();
	int a3 = obj.calSum(a1, a2);
	obj.displaySum(a3);
	
}
}
