package p1;

public class Demo4 {

	public static void main(String[] args) {
		String s1 = "Syl@#via.com";
		String s2 = "[A-Z][a-z]*";
		
		System.out.println(s1.matches(s2));
		s2 = ".*(.com)";
		System.out.println(s1.matches(s2));
		s2 =".{3}[0-9]{2}.*";
		System.out.println(s1.matches(s2));
		s2 =".{3}[^A-Za-z0-9]{2}.*";
		System.out.println(s1.matches(s2));
	}
}
