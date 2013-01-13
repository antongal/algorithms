package com.freenity.miscalgorithms.auxDataStructures;

import java.util.LinkedList;
import java.util.List;

public class BinTree {
	int data;
	BinTree left;
	BinTree right;

	public BinTree(int data, BinTree left, BinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof BinTree)) {
			return false;
		}

		BinTree other = (BinTree) obj;

		if (data != other.data)
			return false;
		if (left != null) {
			if (!left.equals(other.left))
				return false;
		}
		if (right != null) {
			if (!right.equals(other.right))
				return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int result = new Integer(data).hashCode();
		if (left != null) {
			result |= left.hashCode();
		}
		if (right != null) {
			result |= right.hashCode();
		}

		return result;
	}

	@Override
	public String toString() {
		String result = "" + data + ": {";
		if (left != null) {
			result += left.toString();
		} else {
			result += "[]";
		}
		if (right != null) {
			result += right.toString();
		} else {
			result += "[]";
		}
		result += "}";

		return result;
	}

	public List<Integer> toList() {
		List<Integer> leftArray = new LinkedList<Integer>();
		List<Integer> rightArray = new LinkedList<Integer>();

		if (left != null) {
			leftArray = left.toList();
		}

		if (right != null) {
			rightArray = right.toList();
		}

		leftArray.add(data);
		leftArray.addAll(rightArray);

		return leftArray;
	}
}
