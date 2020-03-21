package com.techlabs.assignments;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array = new int[] { 4, 5, 8, 9, 10 };
		reverseArray(array);
		System.out.println(Arrays.toString(array));
	}

	private static void reverseArray(int[] array) {

		int mid = array.length / 2;
		int tmp = 0;

		for (int i = 0; i < mid; i++) {
			tmp = array[array.length - i - 1];
			array[array.length - i - 1] = array[i];
			array[i] = tmp;
		}
	}
}
