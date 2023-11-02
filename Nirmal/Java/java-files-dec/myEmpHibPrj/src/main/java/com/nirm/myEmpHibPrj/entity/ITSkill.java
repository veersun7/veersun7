package com.nirm.myEmpHibPrj.entity;

//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "itskill")
public class ITSkill {
	
	@Id
	private int s_id;
	private String s_name;
	
//	@OneToMany(mappedBy = "employee")
//	
//	private List<Employee> employee;
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	@Override
	public String toString() {
		return "ITSkill [" + s_id + ", " + s_name + "]";
	}

}
