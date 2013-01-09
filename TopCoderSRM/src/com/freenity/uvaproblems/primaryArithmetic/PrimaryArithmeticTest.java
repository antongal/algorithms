package com.freenity.uvaproblems.primaryArithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PrimaryArithmeticTest {

	@Test
	public void test() {
		assertEquals(0, Main.solve(123, 456));
		assertEquals(3, Main.solve(555, 555));
		assertEquals(1, Main.solve(123, 594));
		assertEquals(4, Main.solve(9999, 1));
		assertEquals(3, Main.solve(1, 999));
		assertEquals(3, Main.solve(555, 445));
	}

}
