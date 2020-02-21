package com.techlabs.basic.app;

public class StringTest1 {

	public static void main(String[] args) {
//		String[] strings = { "AB", "ABCDE", "abcdef", "LINEJ", "JENIL", "Valera", "jenilvalera" };

		System.out.println("-----iterate------");
		iterate(args);
		System.out.println("-----iterate for each------");
		iterateForEach(args);
		System.out.println("-----largest------");
		System.out.println(largestString(args));
		System.out.println("-----smallest------");
		System.out.println(smallestString(args));
		System.out.println("-----replace a------");
		replaceWithLetter(args);
	}

	public static void iterate(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	public static void iterateForEach(String[] strings) {
		for (String string : strings) {
			System.out.println(string);
		}
	}

	public static String largestString(String[] strings) {
		int max = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > strings[max].length()) {
				max = i;
			}
		}
		return strings[max];
	}

	public static String smallestString(String[] strings) {
		int min = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() < strings[min].length()) {
				min = i;
			}
		}
		return strings[min];
	}

	public static void replaceWithLetter(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].replace("a", "O");
			System.out.println(strings[i]);
		}
	}
}
