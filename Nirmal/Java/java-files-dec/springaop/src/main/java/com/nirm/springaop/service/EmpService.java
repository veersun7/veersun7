package com.nirm.springaop.service;

import org.springframework.stereotype.Service;

import com.nirm.springaop.model.Employee;

@Service
public class EmpService {
public Employee createEmployee(String empid, String fname,String lname) {
		
		Employee emp1 = new Employee();
		emp1.setEmpId(empid);
		emp1.setFirstName(fname);
		emp1.setLastName(lname);
		return emp1;
	}
	public void deleteEmployee(String empid) {
		System.out.println("Employee deleted : " + empid);
	}
}