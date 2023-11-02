package com.nirm.CollectionDI;

public class Skill {
	private String sname ;	
	public String getSname() {
	
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname= sname;
	}
	@Override
	public String toString() {
		return sname;
	}	
}
