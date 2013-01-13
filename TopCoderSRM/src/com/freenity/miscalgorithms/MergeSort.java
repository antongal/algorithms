package com.freenity.miscalgorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static <T extends Comparable<T>> void merge(List<T> data) {
		internalMergeSort(data, 0, data.size() - 1);
	}

	private static <T extends Comparable<T>> void internalMergeSort(
			List<T> data, int l, int r) {

		if (r - l <= 1) {
			return;
		}

		int middle = (l + r) / 2;

		internalMergeSort(data, l, middle);
		internalMergeSort(data, middle + 1, r);

		merge(data, l, r, middle + 1);
	}

	private static <T extends Comparable<T>> void merge(List<T> data, int l,
			int r, int middle) {
		int il = l;
		int ir = middle;
		List<T> result = new ArrayList<T>(r - l + 1);

		while (il <= middle && ir <= r) {
			if (data.get(il).compareTo(data.get(ir)) < 0) {
				result.add(data.get(il));
				il++;
			} else {
				result.add(data.get(ir));
				ir++;
			}
		}

		while (il <= middle) {
			result.add(data.get(il));
			il++;
		}
		while (ir <= r) {
			result.add(data.get(ir));
			ir++;
		}

		for (int i = l; i <= r; i++) {
			data.set(i, result.get(i - l));
		}
	}
}
