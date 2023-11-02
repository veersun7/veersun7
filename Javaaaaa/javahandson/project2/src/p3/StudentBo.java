package p3;

public class StudentBo {

	public StudentTo getStudent(String sid) {
		
		for (StudentTo x : StudentRepo1.getSlist()) {
			if (x.getSid() == sid) {
				return x;
			}
			
		}
		return null;
	}
	
	//Create a method to get all student belong to a particular city
	
	public StudentTo[] getStudentcity(String city) {
		StudentTo[] arr = new StudentTo[3] ;
		int i = 0;
		
		for (StudentTo x :StudentRepo1.getSlist()) {
			if (x.getCity() == city) {
				arr[i] = x;
				i++;
			}
			
		}
		return arr;
		
	}
	
}
