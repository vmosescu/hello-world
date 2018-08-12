package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
	
	@Test
	public void testNegativeSum() {
		assertEquals(-1, calculator.sum(2, -3));
	}
}