package com.techlabs.basic.app;

public class Substring {

	public static void main(String[] args) {
		System.out.println(substring("bat", "abate") ? "S2 is a substring of S1" : "S2 is not a substring of S1");
	}

	public static boolean substring(String s1, String s2) {
		if (s2.length() > s1.length()) {
			int count = 0;
			for (int i = 0; i < s2.length(); i++) {
				if (s1.charAt(i) == s1.charAt(count)) {
					count++;
				}
				if (count == s1.length()) {
					return true;
				}
			}
		} else {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(count)) {
					count++;
				}
				if (count == s2.length()) {
					return true;
				}
			}
		}
		return false;
	}
}
