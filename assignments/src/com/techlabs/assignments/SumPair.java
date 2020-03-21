package com.techlabs.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPair {

	public static void main(String[] args) {

		List<int[]> list = pairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		for (int[] is : list) {
			System.out.println(Arrays.toString(is));
		}

	}

	private static List<int[]> pairs(int[] array, int number) {
		List<int[]> pair = new ArrayList<int[]>();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] + array[j] == number) {
					pair.add(new int[] { array[i], array[j] });
				}
			}
		}
		return pair;
	}
}
