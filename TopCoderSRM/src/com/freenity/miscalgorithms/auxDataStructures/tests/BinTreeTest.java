package com.freenity.miscalgorithms.auxDataStructures.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.freenity.miscalgorithms.auxDataStructures.BinTree;

public class BinTreeTest {

	@Test
	public void test() {
		BinTree tree = new BinTree(3, new BinTree(1,
				new BinTree(1, null, null), new BinTree(2, null, null)),
				new BinTree(5, new BinTree(4, null, null), new BinTree(7, null,
						null)));

		assertEquals(Arrays.asList(new Integer[] { 1, 1, 2, 3, 4, 5, 7 }),
				tree.toList());
	}

}
