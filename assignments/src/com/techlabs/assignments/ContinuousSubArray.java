package com.techlabs.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuousSubArray {

	public static void main(String[] args) {

		for (List<Integer> list : continuousSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26)) {
			System.out.println(Arrays.toString(list.toArray()));
		}

		for (List<Integer> list : continuousSubArray(new int[] { 12, 5, 31, 13, 21, 8 }, 49)) {
			System.out.println(Arrays.toString(list.toArray()));
		}
	}

	private static List<List<Integer>> continuousSubArray(int[] array, int number) {
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			List<Integer> integers = new ArrayList<>();
			integers.add(array[i]);
			int sum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				integers.add(array[j]);
				sum = sum + array[j];
				if (sum == number) {
					list.add(integers);
					return list;
				} else if (sum > number) {
					break;
				}
			}

		}

		return list;
	}
}
