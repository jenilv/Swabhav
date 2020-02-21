package com.techlabs.basic.app;

public class CompareStrings {

	public static void main(String[] args) {
		System.out.println(compareTo("helli", "hello"));
	}

	public static boolean compareTo(String s1, String s2) {
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length() && i < s2.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					continue;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}

		return true;
	}
}
