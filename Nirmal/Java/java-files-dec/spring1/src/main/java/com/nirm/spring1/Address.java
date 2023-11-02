package com.nirm.spring1;

public class Address {

	private String locality;
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "Address [ "+ locality + "," + city + ", " + state + "]";
	}
	public void setState(String state) {
		this.state = state;
	}
	private String city;
	private String state;
	
}
