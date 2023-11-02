package com.nirm.constrDI;

public class DebitCard {

	private String debitCardNo;
	private String accNo;
	private String accType;
	public DebitCard() {
		System.out.println("Inside Debitcard constructor...");
	}
	
	public void debitCardTransaction() {
		System.out.println("debitCard method for transaction...");
	}
	
}
