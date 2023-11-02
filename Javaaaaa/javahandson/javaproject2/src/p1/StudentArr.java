package p1;

public class StudentArr {
	Student arr[];
	int size;
	
	public void read() {
		System.out.println("Enter how many students");
		size = Read.sc.nextInt();
		arr = new Student[size];
		
	}
public void readStudentDetail() {
	for(int i = 0; i<size ;i++) {
		
		System.out.println("Student" +i +" details");
		arr[i]= new Student();
		arr[i].read();
		
		
	}
}
public void displayAllStudent() {
	for(int i=0; i<size ;i++) {
		arr[i].display();;
		
	}
}
public void displayAllStudentbyAge(int age1) {
	for(int i=0; i<size ;i++) {
		if (arr[i].age==age1) {
			arr[i].display();
		}
		
	}
}
public void displayAllStudentbymarks(int smark,int emark) {
	for(int i=0; i<size ;i++) {
		if (arr[i].marks >= smark && arr[i].marks <= emark) {
	arr[i].display();
	
	}
}
}
}
