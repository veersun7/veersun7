package com.sush.swagger.model;

public class User {

	private int id;
	private String name;
	private String roles;
	private String emailid;
	
	public User() {
		
	}
	public User(int id, String name, String roles, String emailid) {
		this.id = id;
		this.name = name;
		this.roles = roles;
		this.emailid = emailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "User [" + id + ", " + name + ", " + roles + ", " + emailid + "]";
	}	
}
