package p7;

public class Demo2 {

	public static void main(String[] args) {
		try {
			int a,b,out;
			a = 10;
			b = 0;
			out = a/b;
			System.out.println(out);
			
		}catch ( ArithmeticException err) {
			String key = "";
			if (err.getMessage().contains("/ by zero")) {
				key = "zerodivide";
			}
			System.out.println(ResB.getResource(key));
			// TODO: handle exception
			
		}
	}
}
