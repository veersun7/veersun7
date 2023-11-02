package com.nirm.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	@Before(value="execution(* com.nirm.springaop.service.EmpService.*(..)) and args(empid, fname, lname)")
	public void beforeAdvice(JoinPoint joinPoint,String empid,String fname,String lname) {
		
		System.out.println("Before method :" + joinPoint.getSignature());
		System.out.println("Creating employee with empid:"+ empid +"emp Name" + fname+" "+lname);
	}
	@After(value="execution(* com.nirm.springaop.service.EmpService.*(..)) and args(empid, fname, lname)")
	public void afterAdvice(JoinPoint joinPoint, String empid, String fname, String lname) {
		
		System.out.println("Before method :" + joinPoint.getSignature()+" method completed");
	}
	@AfterReturning (value="execution(* com.nirm.springaop.service.EmpService.*(..)) and args(empid)")
	public void afterReturningAdvice(JoinPoint joinPoint, String empid) {
		
		System.out.println("After returning method :" + joinPoint.getSignature()+" method completed");

	}
	
	
}
