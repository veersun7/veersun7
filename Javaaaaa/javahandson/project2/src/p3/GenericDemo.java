package p3;

class Test<T>{
	T a1,b1;
	
	public void setData(T x, T y) {
		a1 = x;
		b1 = y;
	}
	
	public void displayData() {
		System.out.println(a1+" "+b1);
	}
}

class Test1<T,T1>{
	T a1;
	T1 b1;
	
	public void setData(T x, T1 y) {
		a1 = x;
		b1 = y;
	}
	
	public void displayData() {
		System.out.println(a1+" "+b1);
	}
}

public class GenericDemo {
	
	//Generic is template without data type. 
	//Generic can be used for any data type when object is being created
	//Generic is mainly used for storage. It should not be used for computation
	
	public static void main(String[] args) {
		Test<Integer> ob = new Test<>();
		ob.setData(10, 20);
		ob.displayData();
		Test<String> ob1 = new Test<>();
		ob1.setData("Vijay", "Kumar");
		ob1.displayData();
		Test<StudentTo> ob2 = new Test<>();
		ob2.setData(new StudentTo("s009","Peter","Prijoy","Chennai","20/02/1999"), new StudentTo("s010","Peter","Prijoy","Chennai","20/02/1999"));
		ob2.displayData();
		
		Test1<Integer,String>ob3 = new Test1<>();
		ob3.setData(10, "English");
		ob3.displayData();
	}

}