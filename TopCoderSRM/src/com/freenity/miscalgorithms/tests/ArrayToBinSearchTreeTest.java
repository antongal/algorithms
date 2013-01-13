package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.freenity.miscalgorithms.ArrayToBinSearchTree;
import com.freenity.miscalgorithms.auxDataStructures.BinTree;

public class ArrayToBinSearchTreeTest {

	@Test
	public void test() {
		Integer[] data = { 1, 4, 7, 5, 3, 2, 1 };
		BinTree tree = new ArrayToBinSearchTree().toBinTree(data);

		BinTree expected = new BinTree(3, new BinTree(1, new BinTree(1, null,
				null), new BinTree(2, null, null)), new BinTree(5, new BinTree(
				4, null, null), new BinTree(7, null, null)));

		assertEquals(expected, tree);

		data = new Integer[] { 1 };
		assertEquals(new BinTree(1, null, null),
				new ArrayToBinSearchTree().toBinTree(data));
		
		
	}
}
