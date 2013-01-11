package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.freenity.miscalgorithms.StackWithMin;

public class StackWithMinTest {

	@Test
	public void testConstruction() {
		StackWithMin<Integer> stack = new StackWithMin<Integer>();
		
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testPushPop() {
		StackWithMin<Integer> stack = new StackWithMin<Integer>();
		
		stack.push(2);
		stack.push(3);
		stack.push(1);
		
		assertFalse(stack.isEmpty());
		
		assertEquals(1, stack.pop().intValue());
		assertEquals(3, stack.pop().intValue());
		assertEquals(2, stack.pop().intValue());
	}
	
	@Test
	public void testMin() {
		StackWithMin<Integer> stack = new StackWithMin<Integer>();
		
		stack.push(2);
		stack.push(3);
		stack.push(1);
		
		assertFalse(stack.isEmpty());
		
		assertEquals(1, stack.min().intValue());
		stack.pop();
		
		assertEquals(2, stack.min().intValue());
		stack.pop();
		
		assertEquals(2, stack.min().intValue());
		stack.pop();
	}

}
