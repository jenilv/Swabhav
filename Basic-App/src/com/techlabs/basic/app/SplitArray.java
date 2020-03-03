package com.techlabs.basic.app;

public class SplitArray {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 15, 13, 10, 4, 9 };

		int[] sp1 = new int[array.length / 2];
		int[] sp2 = new int[array.length / 2];

		int count = 0;
		for (int i = 0; i < sp1.length; i++, count++) {
			sp1[i] = array[count];
		}
		for (int i = 0; i < sp2.length; i++, count++) {
			sp2[i] = array[count];
		}
		System.out.println();
	}
}
