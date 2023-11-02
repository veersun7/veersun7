package com.nirm.mockitoprj;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MyBuinessMock {

	@Test
	public void test_mock() {
		MyService myService = mock(MyService.class);
		List<String>completeList = Arrays.asList("core Java",
				"Spring Core", "Introduction to Hibernate",
				"Java DataBase Connectivity","complete Hibernate", 
				"Spring Boot", "Advanced Java and Spring", "Spring Security");
	when(myService.getServices("any")).thenReturn(completeList);
	
	MyBusiness myBusiness = new MyBusiness(myService);
	List<String>springServices = myBusiness.getServicesForSpring("any");
	System.out.println(springServices);
	
	assertEquals(4, springServices.size());
	System.out.println("One test done");
	}
	@Test
	public void test_ListMock() {
		
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(0).thenReturn(1).thenReturn(2).thenReturn(24);
		
		assertEquals(0, mockList.size());
		assertEquals(1, mockList.size());
		assertEquals(2, mockList.size());
		List<Integer>list1 = Arrays.asList(11,12,13,14);
		System.out.println("Adding:" +mockList.add(list1));
		System.out.println(mockList.get(0));
		System.out.println("Size = "+mockList.size());
	}
	}

