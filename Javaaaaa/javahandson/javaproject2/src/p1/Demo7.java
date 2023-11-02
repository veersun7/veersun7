package p1;

public class Demo7 {

	public static void main(String[] args) {
		StudentArr obj = new StudentArr();
		
		int choice ;
		do {
			System.out.println("enter 1 create arr,2insert student,3 print all student,4 by age,5 by marks 6 exit");
			choice = Read.sc.nextInt();
			switch(choice) {
			case 1 : obj.read();
			break;
			
			case 2 : obj.readStudentDetail();
			break;
			
			case 3 : obj.displayAllStudent();
			break;
			
			case 4 : System.out.println("enter age 1");
			int age1 = Read.sc.nextInt();
			obj.displayAllStudentbyAge(age1);
			break;
			
			case 5 : System.out.println("enter smark and emarks");
			int smark = Read.sc.nextInt();
			int emark = Read.sc.nextInt();
			obj.displayAllStudentbymarks(smark, emark);
			break;
			
			case 6: System.out.println("App ended");
			
			}
			
		} while (choice !=6);
		
	}
}
