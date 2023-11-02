package com.nirm.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nirm.logic.Calculator;



public class myTest {

	@Test
	public void testAdd() {
		
		assertEquals(10,Calculator.add(4, 6));
		assertEquals(17,Calculator.add(9, 8));
		assertEquals(1, Calculator.sub(10, 9));
		assertEquals(4, Calculator.sub(12, 8));
		assertEquals(90, Calculator.mul(10, 9));
		assertEquals(100, Calculator.mul(10, 10));
		
	}
}
