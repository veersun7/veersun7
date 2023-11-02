package com.nirm.myEmpHibPrj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String laptop;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Laptop [" + lid + ", " + laptop + "]";
	}
	

	
}

