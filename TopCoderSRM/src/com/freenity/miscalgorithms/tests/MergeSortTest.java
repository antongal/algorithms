package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.freenity.miscalgorithms.MergeSort;

public class MergeSortTest {

	@Test
	public void test() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(10);
		data.add(5);
		data.add(4);
		data.add(6);

		List<Integer> copy = new ArrayList<Integer>(data);
		Collections.sort(copy);

		MergeSort.merge(data);

		assertEquals(copy, data);
	}

}
