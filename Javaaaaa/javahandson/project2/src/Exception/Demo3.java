package Exception;

public class Demo3 {
	
	public static void main(String[] args) {
		 
		try {
			int c = f1(10, 0);
			System.out.println(c);
		}catch (ArithmeticException obj) {
			System.err.println(obj);
		}
		
	}
	
	public static int f1(int a, int b)throws ArithmeticException {
		
		return a/b;
	}

}