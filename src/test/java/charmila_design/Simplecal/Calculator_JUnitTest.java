package charmila_design.Simplecal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Calculator_JUnitTest {

	@Test
	/*
	 * TestCases for Addition
	 */
	public void testAdd() {
		
		Operations o = new Operations();
		assertEquals(12,o.add(8,4));
		assertEquals(-6,o.add(3, -9));
		assertEquals(-12,o.add(-3, -9));
	}
	
	@Test
	/*
	 * Test Cases for Multiplication
	 */
	public void testMul() {
		Operations o = new Operations();
		assertEquals(48,o.mul(6, 8));
		assertEquals(20,o.mul(4, 5));
		assertEquals(-24,o.mul(-4, 6));
	}
	@Test
	/*
	 * Test Cases for Division
	 */
	public void testDiv() {
		Operations o = new Operations();
		assertEquals(3,o.div(15, 5));
		assertEquals(2,o.div(4, 2));
		assertEquals(-1,o.div(15, 0));
		assertEquals(-1,o.div(9, 99));
	}
}