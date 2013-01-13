package com.freenity.srm.topcoder.srm566;

/**
 * Solution for the SRM 566 Division II 250-problem <a href=
 * "http://community.topcoder.com/stat?c=problem_statement&pm=12335&rd=15486"
 * >PenguinTiles </a>
 * 
 * @author anton
 * 
 */
public class PenguinTiles {

	public int minMoves(String[] tiles) {
		int emptyRow = 0;
		int emptyCol = 0;

		for (emptyRow = 0; emptyRow < tiles.length; emptyRow++) {
			for (emptyCol = 0; emptyCol < tiles[emptyRow].length(); emptyCol++) {
				if (tiles[emptyRow].charAt(emptyCol) == '.') {
					int totalCol = tiles[0].length() - 1;

					if (emptyRow == tiles.length - 1 && emptyCol == totalCol)
						return 0;
					else if (emptyRow == tiles.length - 1)
						return 1;
					else if (emptyCol == totalCol)
						return 1;
					else
						return 2;
				}
			}
		}
		return -1;
	}
}
