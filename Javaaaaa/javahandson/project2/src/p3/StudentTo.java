package p3;

public class StudentTo {

	private String sid;
	private String fname;
	private String lname;
	private String city;
	private String dob;
	
	public StudentTo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentTo(String sid, String fname, String lname, String city, String dob) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.dob = dob;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "StudentTo [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", dob=" + dob
				+ "]";
	}

}
