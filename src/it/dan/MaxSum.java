package it.dan;

import java.util.SortedSet;
import java.util.TreeSet;

public class MaxSum {

	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>();

		for (int i = 999; i > 99; i--) {

			for (int j = 999; j > 99; j--) {

				if (isPalindrome(i, j)) {
					set.add(i * j);
				}
			}
		}

		System.out.print(set.last());
	}

	private static boolean isPalindrome(int i, int j) {
		Integer number = i * j;

		char[] arr = number.toString().toCharArray();

		for (int k = 0; k < arr.length / 2; k++) {

			if (arr[k] == arr[arr.length - k - 1]) {

				continue;

			} else {

				return false;
			}
		}
		return true;
	}

}
