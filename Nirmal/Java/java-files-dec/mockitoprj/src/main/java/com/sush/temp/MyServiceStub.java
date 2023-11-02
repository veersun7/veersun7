package com.sush.temp;

import java.util.Arrays;
import java.util.List;

import com.nirm.mockitoprj.MyService;



public class MyServiceStub implements MyService {

	@Override
	public List<String> getServices(String user) {
		return Arrays.asList("core Java",
				"Spring Core", "Introduction to Hibernate",
				"Java DataBase Connectivity","complete Hibernate", 
				"Spring Boot", "Advanced Java", "Spring Security");
	}

}
