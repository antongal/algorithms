package com.freenity.srm.topcoder.srm566;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PenguinTilesTest {

	@Test
	public void test() {
		PenguinTiles p = new PenguinTiles();

		String[] s0 = { "PP", "P." };
		assertEquals(0, p.minMoves(s0));

		String[] s1 = { "PPPPPPPP", ".PPPPPPP" };
		assertEquals(1, p.minMoves(s1));

		String[] s2 = { "PPPPPPPP", ".PPPPPPP" };
		assertEquals(1, p.minMoves(s2));

		String[] s3 = { "PPP", "P.P", "PPP" };
		assertEquals(2, p.minMoves(s3));

		String[] s4 = { "P.", "PP", "PP", "PP" };
		assertEquals(1, p.minMoves(s4));

		String[] s5 = { ".PPP", "PPPP", "PPPP", "PPPP" };
		assertEquals(2, p.minMoves(s5));
	}
}
