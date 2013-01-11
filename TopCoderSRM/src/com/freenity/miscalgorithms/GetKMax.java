package com.freenity.miscalgorithms;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class GetKMax {

	/**
	 * Time complexity: O(n*log(n)) where n = list.size()
	 * @param list
	 * @param k
	 * @return
	 */
	public static int getKMax(List<Integer> list, int k) {
		Collections.sort(list);
		return list.get(list.size() - k);
	}

	/**
	 * Time Complexity: O(k*n)
	 * Note: It's only faster if k < log(n)
	 * @param list
	 * @param k
	 * @return
	 */
	public static int getKMaxFaster(List<Integer> list, int k) {
		int min = Collections.min(list);
		int max = min;
		int prev = min;
		HashSet<Integer> maxElements = new HashSet<Integer>();
		
		
		for (int i = 0; i < k; i++) {
			for (Integer n : list) {
				if (n > max && !maxElements.contains(n)) {
					max = n;
				}
			}
			maxElements.add(max);
			prev = max;
			max = min;
		}
		
		return prev;
	}
}
