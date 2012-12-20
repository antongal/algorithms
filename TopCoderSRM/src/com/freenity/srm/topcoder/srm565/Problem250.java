package com.freenity.srm.topcoder.srm565;

import java.util.Arrays;
import java.util.Collections;

/**
 * Problem: ValueHistogram <a href=
 * "http://community.topcoder.com/stat?c=problem_statement&pm=12275&rd=15187"
 * >Problem Statement</a>
 * 
 * @author freenity
 */
public class Problem250 {

	public String[] build(int[] values) {
		int[] freq = new int[50];

		for (int i = 0; i < 50; i++)
			freq[i] = 0;
		int max = 0;

		for (int v : values) {
			freq[v]++;
			if (freq[v] > max) {
				max = freq[v];
			}
		}

		String[] res = new String[max + 1];

		for (int i = 0; i < max + 1; i++) {
			String str = "";
			for (int j = 0; j < 10; j++) {
				str += freq[j] > 0 ? "X" : ".";
				freq[j]--;
			}
			res[i] = str;
		}

		Collections.reverse(Arrays.asList(res));
		return res;
	}

}