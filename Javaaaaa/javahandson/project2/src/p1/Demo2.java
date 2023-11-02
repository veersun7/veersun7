package p1;

public class Demo2 {

	public static void main(String[] args) {
			String s1 = "Chris";
			String s2 = "Cora";
			
			if (s1.equals(s2)) { // whenever we want to compare 2 strings we have to use equals()
		System.out.println("equal");
			} else {
				System.out.println("not equal");
			}
		System.out.println(s1.compareTo(s2));
		for (int i = 65; i<=90 ; i++) {
			System.out.println(i+" "+ (char) i);
		}
		
		System.out.println(s1.equals(s2));
	}
}
