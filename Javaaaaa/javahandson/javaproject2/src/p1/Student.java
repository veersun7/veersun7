package p1;

// create a app to store n student
// each student details are name, age , marks
// (max marks is 0-25) if wrong marks, show error
// display all student 
// display all student of a given age
// display all student of a given mark range

public class Student {

	public void read() {
		System.out.println("enter student name");
		sname = Read.sc.next();
		System.out.println("enter age");
		age = Read.sc.nextInt();	
		
		boolean flag = true;
		
		while (flag) {
		System.out.println("enter marks ");	
		marks = Read.sc.nextInt();
		if(marks >0 && marks <=25) {
			flag = false;
		}else
		{
			System.out.println("invalid marks please re-enter");
		}
		
		
		}
		
	}
	public void display() {
		System.out.println(sname + " "+ age +" "+ marks);
	}
}
