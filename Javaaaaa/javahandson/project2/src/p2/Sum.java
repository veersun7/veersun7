package p2;

public class Sum {

	public static void main(String[] args) {
		String s1 = "10,20,30,40,50,60,1,2,3,4";
		//Find the sum of all the elements
		
		String a[] = s1.split(",") ;
		int sum = 0;
		for (String x : a) {
			sum = sum + Integer.parseInt(x);
		}
		System.out.println("Sum is "+sum);
	}
}

// Use x.trim() if there is a space between the elements