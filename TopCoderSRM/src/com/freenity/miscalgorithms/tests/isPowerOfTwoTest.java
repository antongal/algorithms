package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.freenity.miscalgorithms.IsPowerOfTwo;

public class isPowerOfTwoTest {

	@Test
	public void test() {
		assertTrue(IsPowerOfTwo.isPowerOfTwo(1));
		assertTrue(IsPowerOfTwo.isPowerOfTwo(2));
		assertTrue(IsPowerOfTwo.isPowerOfTwo(4));
		assertTrue(IsPowerOfTwo.isPowerOfTwo(8));
		assertTrue(IsPowerOfTwo.isPowerOfTwo(32));
		
		assertFalse(IsPowerOfTwo.isPowerOfTwo(3));
		assertFalse(IsPowerOfTwo.isPowerOfTwo(10));
		assertFalse(IsPowerOfTwo.isPowerOfTwo(14));
	}

}
