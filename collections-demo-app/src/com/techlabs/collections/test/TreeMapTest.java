package com.techlabs.collections.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < 6; i++) {
			map.put("String " + i, i);
		}
		for (String string : map.keySet()) {
			System.out.println(string + ", " + map.get(string));
		}
		System.out.println("-----------");
		map.put("String 1", 214);
		map.put("String 2", 3);
		map.remove("String 3");
		for (String string : map.keySet()) {
			System.out.println(string + ", " + map.get(string));
		}
	}
}
