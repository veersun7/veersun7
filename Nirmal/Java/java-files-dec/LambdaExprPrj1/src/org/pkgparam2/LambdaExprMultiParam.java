package org.pkgparam2;

public class LambdaExprMultiParam implements calculable {

	
	@Override
	public int add(int x, int y) {
		return 0;
	}
	
		public static void main(String[] args) {
			
			//Lambda expr without return statement
			System.out.println("Lambda expr without return statement");
			calculable c1 = (x1,y1)->(x1+y1);
		System.out.println(c1.add(10,12));

		
		//Lambda expr with return statement
		System.out.println("Lambda expr with return statement");
		calculable c2 = (x1,y1)->{
			return(x1+y1);
		};
	System.out.println(c2.add(53,23));
	}

}
