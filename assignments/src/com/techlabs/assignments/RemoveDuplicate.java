package com.techlabs.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 })));
	}

	private static int[] removeDuplicates(int[] array) {

		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}

		int[] arr = new int[set.size()];
		int count = 0;
		for (int number : set) {
			arr[count++] = number;
		}
		return arr;
	}
}
