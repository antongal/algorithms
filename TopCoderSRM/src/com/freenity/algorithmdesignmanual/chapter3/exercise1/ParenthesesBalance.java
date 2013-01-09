package com.freenity.algorithmdesignmanual.chapter3.exercise1;

import java.util.Stack;

public class ParenthesesBalance {

	/**
	 * Returns true if the parentheses of the string s are balanced.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isParenthesesBalanced(String s) {
		Stack<Integer> parentheses = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				parentheses.push(i);
			} else {
				if (parentheses.size() == 0) {
					return false;
				}
				parentheses.pop();
			}
		}

		return parentheses.size() == 0;
	}
}
