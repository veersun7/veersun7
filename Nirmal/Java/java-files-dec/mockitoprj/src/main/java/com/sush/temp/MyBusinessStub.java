package com.sush.temp;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.nirm.mockitoprj.MyBusiness;
import com.nirm.mockitoprj.MyService;

public class MyBusinessStub {

	
	@Test
	public void test() {
		MyService myServiceStub = new MyServiceStub();
		MyBusiness business = new MyBusiness(myServiceStub);
		List<String>javaServices = business.getServicesForJava("Any");
		assertEquals(3,javaServices.size());
		System.out.println(javaServices);
	}
	}

