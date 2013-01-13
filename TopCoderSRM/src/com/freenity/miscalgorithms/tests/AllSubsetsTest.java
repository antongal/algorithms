package com.freenity.miscalgorithms.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.freenity.miscalgorithms.AllSubsets;

public class AllSubsetsTest {

	@Test
	public void test() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);

		Set<Set<Integer>> subsets = new HashSet<Set<Integer>>();
		subsets.add(new HashSet<Integer>());
		
		Set<Integer> one = new HashSet<Integer>();
		one.add(1);
		subsets.add(one);

		Set<Integer> two = new HashSet<Integer>();
		two.add(2);
		subsets.add(two);

		Set<Integer> three = new HashSet<Integer>();
		three.add(3);
		subsets.add(three);

		Set<Integer> onetwo = new HashSet<Integer>();
		onetwo.add(1);
		onetwo.add(2);
		subsets.add(onetwo);

		Set<Integer> onethree = new HashSet<Integer>();
		onethree.add(1);
		onethree.add(3);
		subsets.add(onethree);

		Set<Integer> twothree = new HashSet<Integer>();
		twothree.add(2);
		twothree.add(3);
		subsets.add(twothree);

		Set<Integer> onetwothree = new HashSet<Integer>();
		onetwothree.add(1);
		onetwothree.add(2);
		onetwothree.add(3);
		subsets.add(onetwothree);
		
		assertEquals(subsets, AllSubsets.getAllSubsets(set));
		
		set.add(4);
		assertEquals(16, AllSubsets.getAllSubsets(set).size());
		
	}
}
