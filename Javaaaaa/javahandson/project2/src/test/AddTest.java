package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import p5.AddI;
import p5.AddI0;
import p5.AddI1;
import p5.ExceptionTesting;

class AddTest {

	@Test
	public void testcase1() {
		
		AddI obj = new AddI();
		obj.setData(10, 20);
		obj.calc();
		int expected = 30;
		assertEquals(expected, obj.sum);
	}
	
	@Test
	public void testCase2() {
		
		try {
		AddI obj = new AddI0();
		obj.display();	
	}catch(Exception e) {
		fail();
	}

}
	@Test
	public void testCase3() {
		ExceptionTesting obj = new ExceptionTesting();
		assertEquals(obj.f1("10", "2"), 5);
	}
	@Test
	public void testCase4() {
		ExceptionTesting obj = new ExceptionTesting();
		assertEquals(obj.f1("10", "2"), 5);
		assertThrows(NumberFormatException.class,()-> obj.f1("a", "2"));
	}
	@Test
	public void testCase5() {
		ExceptionTesting obj = new ExceptionTesting();
		assertThrows(NullPointerException.class, ()-> obj.f1(null, "2"));
		
	}
	@Test
	public void testCase6() {
		ExceptionTesting obj = new ExceptionTesting();
		assertThrows(ArithmeticException.class, ()-> obj.f1("20", "0"));
		
	}
	@Test
public void testCase7() {
		
		AddI obj = new AddI1();
		obj.setData(20, 40);
		int expected = 20;
		assertEquals(expected, obj.getNum1());
}
	@Test
public void testCase8() {
		
		AddI obj = new AddI1();
		obj.setData(20, 40);
		int expected = 40;
		assertEquals(expected, obj.getNum2());
}
	
}
