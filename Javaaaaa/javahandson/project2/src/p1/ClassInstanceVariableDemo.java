package p1;

public class ClassInstanceVariableDemo {

		int a = 10;  //outside the method (i.e) instance variable
		static int b = 20; // class variable
		
		public static void main(String[] args) {
			int c = 30; // local variable
			
			System.out.println(ClassInstanceVariableDemo.b); // you can call only class variable hence used 'b'
			//System.out.println(this.a);
			ClassInstanceVariableDemo obj = new ClassInstanceVariableDemo();
			ClassInstanceVariableDemo obj1 = new ClassInstanceVariableDemo();
			
			obj.a++;
			obj.b++;
			
			System.out.println("OBJ-A " +obj.a);
			System.out.println("OBJ-B " +obj.b);
			System.out.println("OBJ1-A " +obj1.a);
			System.out.println("OBJ1-B " +obj1.b);
			System.out.println("Local C " +c);
			
			obj.f1();
			obj.f1();
		}
		
		public void f1() {
				System.out.println("F1 " +this.a);
				System.out.println("F1 " +b);
				f2();
				//System.out.println(c); c is a local variable of main method which cannot be called
			
		}
		
		public static void f2() {
		//	System.out.println("F2" +this.a); F2 is a static method which cant call instance variable
			System.out.println("F2 " + b);
		// f1(); since F2 is a static, it cannot call non-static method
		}
}
