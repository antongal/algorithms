package com.freenity.algorithmdesignmanual.chapter3.exercise1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestParenthesesBalanced {

	@Test
	public void test() {
		assertTrue(ParenthesesBalance.isParenthesesBalanced("((())())()"));
		assertFalse(ParenthesesBalance.isParenthesesBalanced(")()("));
		assertFalse(ParenthesesBalance.isParenthesesBalanced("())"));
	}

}
