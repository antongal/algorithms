package com.freenity.miscalgorithms;

public class LocalMin {
	public static int findLocalMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] < nums[i+1]) {
				return nums[i];
			}
		}
		return nums[nums.length-1];
	}
}
