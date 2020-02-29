package com.techlabs.basic.app;

public class StringTest1 {

	public static void main(String[] args) {
//		String[] words = { "AB", "ABCDE", "abcdef", "LINEJ", "JENIL", "Valera", "jenilvalera" };

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

	public static void iterate(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public static void iterateForEach(String[] words) {
		for (String string : words) {
			System.out.println(string);
		}
	}

	public static String largestString(String[] words) {
		int max = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > words[max].length()) {
				max = i;
			}
		}
		return words[max];
	}

	public static String smallestString(String[] words) {
		int min = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < words[min].length()) {
				min = i;
			}
		}
		return words[min];
	}

	public static void replaceWithLetter(String[] words) {
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replace("a", "O");
			System.out.println(words[i]);
		}
	}
}
