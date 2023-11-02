package Exception;

public class Demo6 {
	
	public static void main(String[] args) {
		try {
			try {
				int a = 20;
				int b = 0;
				int c = a/b;
				System.out.println(c);
			}finally {
				System.out.println("I am in inner finally block");
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I am in outer finally block");
		}
	}

}
