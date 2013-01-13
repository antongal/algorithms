package com.freenity.miscalgorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class AllSubsets {

	public static Set<Set<Integer>> getAllSubsets(Set<Integer> set) {
		return recursiveGetAllSubsets(new LinkedList<Integer>(set));
	}

	private static Set<Set<Integer>> recursiveGetAllSubsets(
			LinkedList<Integer> list) {

		list = new LinkedList<Integer>(list);

		if (list.isEmpty()) {
			Set<Set<Integer>> res = new HashSet<Set<Integer>>();
			res.add(new HashSet<Integer>());
			return res;
		}

		Integer n = list.removeFirst();

		Set<Set<Integer>> a = recursiveGetAllSubsets(list);
		Set<Set<Integer>> b = recursiveGetAllSubsets(list);

		for (Set<Integer> s : a) {
			s.add(n);
		}

		a.addAll(b);

		return a;
	}

}
