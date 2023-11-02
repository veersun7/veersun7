package p2;

import java.util.*;

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Phone number");
		String ph = sc.nextLine();
		String regex = "[0-9\\-]{10}";
		System.out.println(ph.matches(regex));
		
	}

}
