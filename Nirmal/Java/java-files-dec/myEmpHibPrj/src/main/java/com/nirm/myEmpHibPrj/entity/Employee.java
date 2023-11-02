package com.nirm.myEmpHibPrj.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int id;
	private Name ename;
	private String dept;
	
	@OneToOne
	private Laptop laptop;
	
	@OneToMany
	List<ITSkill> skills = new ArrayList<ITSkill>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Name getEname() {
		return ename;
	}
	public void setEname(Name ename) {
		this.ename = ename;
	}
	
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public List<ITSkill> getSkills() {
		return skills;
	}
	public void setSkills(List<ITSkill> skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", dept=" + dept + ", laptop=" + laptop +","+ skills + "]";
	}
	
	
	

}
