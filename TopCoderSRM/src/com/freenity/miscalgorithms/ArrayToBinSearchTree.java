package com.freenity.miscalgorithms;

import java.util.Arrays;

import com.freenity.miscalgorithms.auxDataStructures.BinTree;

public class ArrayToBinSearchTree {

	private Integer[] data;

	public BinTree toBinTree(Integer[] data) {
		Arrays.sort(data);
		this.data = data;

		return internalToBinTree(0, data.length-1);
	}

	private BinTree internalToBinTree(int l, int r) {
		int middle = (r + l) / 2;

		if (r - l <= 0) {
			return new BinTree(data[middle], null, null);
		}

		BinTree left = internalToBinTree(l, middle-1);
		BinTree right = internalToBinTree(middle + 1, r);

		return new BinTree(data[middle], left, right);
	}
}
