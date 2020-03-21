package com.techlabs.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDulplicates {

	public static void main(String[] args) {

		findDuplicates(new int[] { 4, 5, 8, 7, 4, 7, 6, 7 });
	}

	private static void findDuplicates(int[] array) {

		Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> duplicates = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!set.add(array[i])) {
				duplicates.add(array[i]);
			}
		}

		System.out.println(duplicates);
	}
}
