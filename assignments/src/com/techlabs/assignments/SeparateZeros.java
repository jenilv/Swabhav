package com.techlabs.assignments;

import java.util.Arrays;

public class SeparateZeros {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(separateZeros(new int[] { 12, 0, 7, 0, 8, 0, 3 })));
		System.out.println(Arrays.toString(separateZeros(new int[] { 1, -5, 0, 0, 8, 0, 1 })));
	}

	private static int[] separateZeros(int[] array) {
		int[] arr = new int[array.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (array[i] != 0) {
				arr[j++] = array[i];
			}
		}

		return arr;
	}
}
