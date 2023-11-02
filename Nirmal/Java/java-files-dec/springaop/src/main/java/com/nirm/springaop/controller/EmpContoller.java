package com.nirm.springaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nirm.springaop.model.Employee;
import com.nirm.springaop.service.EmpService;

@RestController
public class EmpContoller {

	@Autowired
	private EmpService empService;
	
	
	@RequestMapping(value="/employee/add", method=RequestMethod.GET )
	public Employee addEmployee(@RequestParam("empid")String empid,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName)
	{
		return empService.createEmployee(empid, firstName, lastName);
	}
	
	
	@RequestMapping(value="/employee/remove", method=RequestMethod.GET)
	public String removeEmployee(@RequestParam("empid") String empid) {
		empService.deleteEmployee(empid);
		return("Employee removed with id: "+ empid);
		
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		System.out.println("Hiiiii");
		return("Hello");
		
	}
}
