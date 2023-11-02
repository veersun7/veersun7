package p3;

public class StudentRepo {

	private StudentTo[] slist;
	
	public StudentRepo() {
		super();
		slist = new StudentTo[3];
		slist[0] = new StudentTo("s001","Dia","john","chennai","30-09-1990");
		slist[1] = new StudentTo("s002","Sam","Disha","mumbai","23-07-1998");
		slist[2] = new StudentTo("s003","Joe","jim","Kerala","09-09-1992");
		
	}

	public StudentTo[] getSlist() {
		return slist;
	}
	
	
}
