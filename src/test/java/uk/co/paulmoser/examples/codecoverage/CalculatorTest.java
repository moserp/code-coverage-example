package uk.co.paulmoser.examples.codecoverage;

import org.junit.Test;

import static org.junit.Assert.assertThat;
//import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void addsTwoNumbers() {
		assertThat(calculator.add(2, 2), is(4));
	}
	
	@Test
	public void multipliesTwoNumbers() {
		assertThat(calculator.multiply(2, 2), is(4));
	}
	
	@Test
	public void dividesTwoNumbers() {
		calculator.divide(5, 2);		
	}
}
