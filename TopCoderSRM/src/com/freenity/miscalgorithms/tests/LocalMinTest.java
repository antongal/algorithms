package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.freenity.miscalgorithms.LocalMin;

public class LocalMinTest {

	@Test
	public void test() {
		assertEquals(1, LocalMin.findLocalMin(new int[] {1}));
		assertEquals(1, LocalMin.findLocalMin(new int[] {1,2,3}));
		assertEquals(1, LocalMin.findLocalMin(new int[] {3,2,1}));
		assertEquals(1, LocalMin.findLocalMin(new int[] {3,1,2}));
	}
}
