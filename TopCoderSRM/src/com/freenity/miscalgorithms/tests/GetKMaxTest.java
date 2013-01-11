package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.freenity.miscalgorithms.GetKMax;

public class GetKMaxTest {

	@Test
	public void test() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		
		assertEquals(4, GetKMax.getKMax(list, 1));
		assertEquals(3, GetKMax.getKMax(list, 2));
		assertEquals(2, GetKMax.getKMax(list, 3));
		assertEquals(1, GetKMax.getKMax(list, 4));
	}
	
	@Test
	public void testFasterImplementation() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		
		assertEquals(4, GetKMax.getKMaxFaster(list, 1));
		assertEquals(3, GetKMax.getKMaxFaster(list, 2));
		assertEquals(2, GetKMax.getKMaxFaster(list, 3));
		assertEquals(1, GetKMax.getKMaxFaster(list, 4));
	}

}
