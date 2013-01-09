package com.freenity.uvaproblems.primaryArithmetic;

import java.util.Scanner;

/**
 * Solution for "Primay Arithmetic" Problem {@link http
 * ://uva.onlinejudge.org/external/100/10035.html}
 * 
 * @author anton
 * 
 */
class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextLine()) {
			int a = reader.nextInt();
			int b = reader.nextInt();

			if (a == 0 && b == 0)
				break;

			int res = solve(a, b);
			if (res == 0) {
				System.out.println("No carry operation.");
			} else {
				String s = res > 1 ? "s" : "";
				System.out.println(res + " carry operation" + s + ".");
			}
		}

		reader.close();
	}

	public static int solve(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}

		if (a % 10 + b % 10 >= 10) {
			return 1 + solve(a / 10, 1) + solve(a / 10 +1, b / 10);
		}
		return solve(a / 10, b / 10);
	}

}
