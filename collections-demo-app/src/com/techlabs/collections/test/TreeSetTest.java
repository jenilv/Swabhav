package com.techlabs.collections.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < 6; i++) {
			set.add("String " + i);
		}
		set.add("String 1");
		set.add("String 2");
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("-----------");
		set.remove("String 3");
		for (String string : set) {
			System.out.println(string);
		}
	}
}
