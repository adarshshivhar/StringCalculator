package com.stringcalculator;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void testEmptyString() {
		StringCalculator cal = new StringCalculator();
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void testOneNumber() {
		StringCalculator cal = new StringCalculator();
		assertEquals(1, cal.add("1"));
		assertEquals(2, cal.add("2"));
		assertEquals(3, cal.add("3"));
	}
	
	@Test
	public void testTwoNumber() {
		StringCalculator cal = new StringCalculator();
		assertEquals(3, cal.add("1,2"));
		assertEquals(5, cal.add("2,3"));
	}
	
	@Test
	public void testThreeNumber() {
		StringCalculator cal = new StringCalculator();
		assertEquals(6, cal.add("1,2,3"));
	}
	
	@Test
	public void testWithNewLine() {
		StringCalculator cal = new StringCalculator();
		assertEquals(6, cal.add("1\n2,3"));
	}
}
