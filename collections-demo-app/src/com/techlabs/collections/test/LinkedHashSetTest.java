package com.techlabs.collections.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < 6; i++) {
			set.add("String " + i);
		}
		set.add("String 1");
		set.add("String 2");
		for (String string : set) {
			System.out.println(string);
		}
		set.remove("String 3");
		System.out.println("-----------");
		for (String string : set) {
			System.out.println(string);
		}
	}
}
