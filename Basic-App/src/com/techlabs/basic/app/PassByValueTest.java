package com.techlabs.basic.app;

public class PassByValueTest {

	public static void main(String[] args) {

		int a = 10;
		int[] arr = { 10, 20, 30, 40 };
		mutableInt(a);
		mutableArray(arr);
		System.out.println(a);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void mutableInt(int a) {
		a = 20;
	}

	public static void mutableArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
}
