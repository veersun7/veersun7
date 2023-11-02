package p2;

public class Split {

	public static void main(String[] args) {
		String s1 = "Select SID,Fname,Dob from Sdetails where sid = \'s001\'";
		System.out.println(s1);
		
		//1. Display all column from query
		//2. Display condition in query
		
		String s2[]= s1.split("from");
		String s3[]= s2[0].split("Select");
		for (String x : s3[1].split(",")) {
			System.out.println(x);
		}
		
		String s4[]=s2[1].split("where ");
		System.out.println(s4[1]);
		String s0 = "Select SID,Fname,Dob from Sdetails where sid = \\s001\\";
//		System.out.println(s0);
//		System.out.println(s2[0]);
//		System.out.println(s2[1]);
		
		String s5 = "Select SID,Fname,Dob from Sdetails where sid in (select sid from test)";
		String s6[] = s5.split("from");
		for (String x : (s6[0].split("Select"))[1].split(",")) {
			System.out.println(x);
		}
		
		int flag = 0;
		for (String x:s6[1].split("select ")) {
			if (flag!= 0) {
				System.out.println(x);
				
			}flag++;
			
		}
	}
}
