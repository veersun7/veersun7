package com.nirm.constrDI;

public class Customer {

	private String cust_id;
	private String cust_name;
	private String cust_mob;
	
	private DebitCard debitCard;

	public Customer(String cust_id, String cust_name, String cust_mob, DebitCard debitCard) {
		System.out.println("Inside Customer constructor with all args...");
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_mob = cust_mob;
		this.debitCard = debitCard;
	}
	
	public Customer(DebitCard debitCard) {
	System.out.println("Inside Customer constructor...");
	this.debitCard = debitCard;
}
	public void transact() {
		debitCard.debitCardTransaction();
		
	
	}
}
