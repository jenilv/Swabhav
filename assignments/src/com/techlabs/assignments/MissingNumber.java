package com.techlabs.assignments;

public class MissingNumber {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 4, 5, 3, 2, 8, 6 };
		System.out.println(missingNumber(array));
	}

	private static int missingNumber(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] != array[i] + 1) {
				return array[i] + 1;
			}
		}

		return 0;
	}

}
