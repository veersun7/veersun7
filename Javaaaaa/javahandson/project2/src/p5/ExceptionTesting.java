package p5;

public class ExceptionTesting {
	
public int f1(String x, String y) {
		
		if (x == null) {
			throw new NullPointerException();
		}
		
		return Integer.parseInt(x)/Integer.parseInt(y);
			
		
	}

}
