package com.techlabs.collections.test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		int c = 1;
		List<String> strings = new LinkedList<>();
		strings.add("String " + c++);
		strings.add("String " + c++);
		strings.add("String " + c++);
		strings.add("String " + c++);
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
