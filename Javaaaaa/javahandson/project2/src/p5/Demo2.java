package p5;

public class Demo2 {

	public static void main(String[] args) {
		Addition2 obj = (x,y)->{
			return x+y;
		};
		
		System.out.println(obj.cal(20, 9));
		obj = (x,y)->(x-y);
		System.out.println(obj.cal(20, 9));
	}
}
