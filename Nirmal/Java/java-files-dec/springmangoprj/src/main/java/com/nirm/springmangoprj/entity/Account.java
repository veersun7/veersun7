package com.nirm.springmangoprj.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="account")
public class Account {
	
	@Id
	private String actNo;
	private String name;
	private String actType;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(String name, String actType, double balance) {
		
		this.name = name;
		this.actType = actType;
		this.balance = balance;
	}

	public String getActNo() {
		return actNo;
	}

	public void setActNo(String actNo) {
		this.actNo = actNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActType() {
		return actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [" + actNo + ", " + name + ", " + actType + ", " + balance + "]";
	}	

}