package com.techlabs.basic.app;

public class JoinArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 6, 7, 8, 9 };

		int[] join = new int[arr1.length + arr2.length];

		int count = 0;
		for (int i = 0; i < arr1.length; i++, count++) {
			join[count] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++, count++) {
			join[count] = arr2[i];
		}
		for (int i : join) {
			System.out.println(i);
		}
	}
}
