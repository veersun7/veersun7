package p1;

public class Demo3 {

	public static void main(String[] args) {
		String s1 = "Hi Have a great day";
		String s2[] = s1.split(" ");
		
		for (int i = 0; i< s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		for (String x: s2) {
			System.out.println(x);
		}
		
		int[] a1 = {10,20,30};
		
		for (int x : a1) {
			
			System.out.println(x);
		}
		
		int [][] b1 = {{1,2,3},{2,3,4}};
		
		for (int i = 0; i< b1.length;i++) {
			for (int j = 0; j< b1[i].length;j++) {
			System.out.println(b1[i][j]+ " ");
		}
		
		System.out.println();
			
	}
}
	
}
