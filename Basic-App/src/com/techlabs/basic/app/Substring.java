package com.techlabs.basic.app;

public class Substring {

	public static void main(String[] args) {
		System.out.println(substring("hello", "ll") ? "S1 contains S2" : "S1 does not contain S2");
	}

	public static boolean substring(String s1, String s2) {
		if (s2.length() > s1.length()) {
			return false;
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
