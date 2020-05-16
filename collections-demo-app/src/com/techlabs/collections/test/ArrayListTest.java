package com.techlabs.collections.test;

import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> strings = new LinkedList<>();
		for (int i = 0; i < 6; i++) {
			strings.add("String " + i);
		}
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println("------");
		strings.remove(2);
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
