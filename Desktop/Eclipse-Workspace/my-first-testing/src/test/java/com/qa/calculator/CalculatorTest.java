package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setup() {
		calculator= new Calculator();
		
	}
	@Test
	public void MultiplyTestWithTwoTwo() {
	
		calculator.multiply(3,2);
		assertEquals(4, calculator.multiply(2, 2));

	}
	@Test
	public void MultiplyTestWithThreeTwo() {
		calculator.multiply(3,2);
		assertEquals(6, calculator.multiply(3, 2));
}
	@Test
	public void DivideTestWithTwoTwo() {
		calculator.divide(2,2);
		assertEquals(1, calculator.divide(2, 2),0
				);
		} 
	
	@Test()
	public void DivideByZero() {
		calculator.divide(5,0);
	}
	public void DivideTestWithThreeTwo() {
		assertEquals(2, calculator.divide(4, 2), 0);
	}
	
	@Test
	public void AddTestWithTwoTwo() {
		calculator.add(2,2);
		assertEquals(4, calculator.add(2, 2));
}
	@Test
	public void AddTestWithThreeTwo() {
		calculator.add(3,2);
		assertEquals(5, calculator.add(3, 2));
		}
	@Test
	public void SubstractTestWithTwoTwo() {
		calculator.substract(2,2);
		assertEquals(0, calculator.substract(2, 2));
	}
		@Test
		public void SubstractTestWithThreeTwo() {
			calculator.substract(3,2);
			assertEquals(1, calculator.substract(3, 2));
		}}


