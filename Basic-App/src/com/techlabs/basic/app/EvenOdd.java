package com.techlabs.basic.app;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		printOddEven(args);
	}

	public static void printOddEven(String[] strings) {
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			if (Integer.parseInt(strings[i]) % 2 == 0) {
				even.add(Integer.parseInt(strings[i]));
//				System.out.println(strings[i] + " even");
			} else {
				odd.add(Integer.parseInt(strings[i]));
//				System.out.println(strings[i] + " odd");
			}
		}
		System.out.println("even");
		for (Integer integer : even) {
			System.out.println(integer);
		}
		System.out.println("odd");
		for (Integer integer : odd) {
			System.out.println(integer);
		}
	}
}
