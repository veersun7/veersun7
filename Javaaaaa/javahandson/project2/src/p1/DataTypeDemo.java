package p1;

public class DataTypeDemo {
	
public static void main(String[] args) {
		
		int a = 10; //primitive data type
		Integer b = 30; // Wrapper Class
		float c = 20.3f; //20.3 is double and 20.3f is float value
		long d = 400L;
		b = (int) c; //1. b is not  primitive, still it is a wrapper class
		// c is primitive is being assigned to wrapper class, this concept is called boxing
		System.out.println(b);
		b = b.valueOf("30"); //since b is wrapper class, it contain method for conversion
		System.out.println(b);
		b++;
		System.out.println(b);
		
		String x = "35";
		b = b.valueOf(x.toString());
		System.out.println(b);
		
		String x1 = "Diana";
		System.out.println(x1);
		String x2 = x1;
		x1 = x1.toUpperCase();
		System.out.println(x1);
		System.out.println(x2);
		
		StringBuffer s1 = new StringBuffer("Chris");
		StringBuffer s2 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		s1.append("chennai nn");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(x1.charAt(2));
		System.out.println(x1.length());
		System.out.println(x1.indexOf("U"));
		System.out.println(s1.indexOf("n"));
		System.out.println(s1.indexOf("n", 9));
		
		
		int c1 = 0;
		int n1 = -1;
		while (true) {
			
			n1 = s1.indexOf("n",n1+1);
			if (n1==-1) {
				break;
			}
			else {
				c1++;
			}
		}
		System.out.println("Number of N = "+ c1);
	}

}
