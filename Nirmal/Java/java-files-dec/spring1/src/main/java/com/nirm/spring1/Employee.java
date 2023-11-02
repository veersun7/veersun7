package com.nirm.spring1;

public class Employee {
	
	private String name;
	private String surname;
	private String email;
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Employee [" + name + ", " + surname + ", " + email + ", " + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("The Employee Name : " + name+" email :" + email);
	}
	
	public void merge() {
		System.out.println("The Employee Surname for " + name + " is " + surname+" email :" + email);
	}
	
}