package com.freenity.algorithmdesignmanual.chapter3.exercise2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void testAdd() {
		LinkedList<Integer> list = new LinkedList<Integer>();

		assertEquals(0, list.size());

		list.add(1);
		list.add(2);

		assertEquals(2, list.size());
		assertEquals(1, list.get(0).intValue());
		assertEquals(2, list.get(1).intValue());

	}

	@Test
	public void testRemove() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);

		assertEquals(2, list.size());

		list.remove(1);
		assertEquals(1, list.size());
		assertEquals(1, list.get(0).intValue());

		list.remove(0);
		assertEquals(0, list.size());
	}

	@Test
	public void testIterate() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		Iterator<Integer> it = list.iterator();

		assertTrue(it.hasNext());
		assertEquals(1, it.next().intValue());

		assertTrue(it.hasNext());
		assertEquals(2, it.next().intValue());

		assertTrue(it.hasNext());
		assertEquals(3, it.next().intValue());
	}

	@Test
	public void testReverse() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.reverse();
		
		assertEquals(3, list.size());
		assertEquals(3, list.get(0).intValue());
		assertEquals(2, list.get(1).intValue());
		assertEquals(1, list.get(2).intValue());
	}
}
