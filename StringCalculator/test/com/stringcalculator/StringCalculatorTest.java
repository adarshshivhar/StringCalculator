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
}
