package com.techlabs.basic.app;

public class Arrary {

	public static void main(String[] args) {
		int[] array = new int[] { 13, -12, 25, -3, 7, -6 };
//		segregate(array);
//		common(new int[] { 1, 12, 3, 5 }, new int[] { 12, 5, 6, 7 });
		sort(new int[] { 15, 10, 3, 22, 37 });
	}

	public static void segregate(int[] array) {
		int[] tmp = new int[array.length];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				tmp[count++] = array[i];
			}
		}
		for (int i = 0; i < tmp.length; i++) {
			if (array[i] < 0) {
				tmp[count++] = array[i];
			}
		}
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		System.out.println("=================");

		int max = tmp[0];
		for (int i = 0; i < tmp.length; i++) {

		}
	}

	public static void common(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
