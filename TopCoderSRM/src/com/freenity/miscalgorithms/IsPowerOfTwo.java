package com.freenity.miscalgorithms;

public class IsPowerOfTwo {

	public static boolean isPowerOfTwo(int n) {
		int ones = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				ones++;
			}
			n = n >> 1;
		}
		
		return ones == 1;
	}
}
