package p3;

public class StudentRepo1 {

	private static StudentTo[] slist;
	
	static {
	slist = new StudentTo[3];
	slist[0] = new StudentTo("s001","Dia","john","chennai","30-09-1990");
	slist[1] = new StudentTo("s002","Sam","Disha","mumbai","23-07-1998");
	slist[2] = new StudentTo("s003","Joe","jim","Kerala","09-09-1992");
}

	public static StudentTo[] getSlist() {
		return slist;
	}
}
