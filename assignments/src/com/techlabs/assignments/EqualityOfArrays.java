package com.techlabs.assignments;

public class EqualityOfArrays {

	public static void main(String[] args) {

		int[] array1 = new int[] { 21, 57, 11, 37, 24 };
		int[] array2 = new int[] { 21, 57, 11, 37, 24 };
		System.out.println(isEqual(array1, array2));
	}

	private static boolean isEqual(int[] array1, int[] array2) {

		if (array1.length != array2.length) {
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}
}
