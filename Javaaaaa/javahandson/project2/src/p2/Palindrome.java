package p2;

public class Palindrome {

	public static void main(String[] args) {
		int a1 = 565;
		// check given number is Palindrome or not, using STRING BUFFER
		
		StringBuffer obj = new StringBuffer(String.valueOf(a1));
		int b1 = Integer.parseInt(obj.reverse().toString());
		int c1 = Integer.reverse(a1);
		
		if(a1 == b1) {
			System.out.println("Given is a palindrome");
	}
	else {
		System.out.println("Given is not a palindrome");	
	}
	System.out.println(c1);	
}	
}
