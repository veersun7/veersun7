package p3;

public class Demo2 {

	public static void main(String[] args) {
		
		StudentRepo obj = new StudentRepo();
		for (StudentTo x : obj.getSlist()) {
			System.out.println(x);	
		}
		
		for (StudentTo x : StudentRepo1.getSlist()) {
			System.out.println(x);
		}
		
		StudentBo sbo = new StudentBo();
		StudentTo result = sbo.getStudent("s003");
		System.out.println("ID match "+result);
		System.out.println("------------citywise list-----------");
		StudentTo[] ar = sbo.getStudentcity("Kerala");
		
		for (StudentTo x : ar) {
			System.out.println(x);
		}
	}
}
