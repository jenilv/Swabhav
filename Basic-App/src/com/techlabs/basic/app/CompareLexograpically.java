package com.techlabs.basic.app;

public class CompareLexograpically {

	public static void main(String[] args) {
		System.out.println(compare("batp", "bata"));
	}

	public static int compare(String s1, String s2) {

		int i = 0, j = 0;
		while (i < s1.length()) {
			if (j == s2.length()) {
				return 1;
			}
			while (j < s2.length()) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
					break;
				} else if (s1.charAt(i) != s2.charAt(j)) {
					return s1.charAt(i) - s2.charAt(j);
				}
			}
		}

		return 0;
	}
}
