package com.techlabs.collections.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < 6; i++) {
			map.put("String " + i, i);
		}
		for (String string : map.keySet()) {
			System.out.println(string + ", " + map.get(string));
		}
		map.put("String 1", 214);
		map.put("String 2", 3);
		map.remove("String 3");
		System.out.println("-----------");
		for (String string : map.keySet()) {
			System.out.println(string + ", " + map.get(string));
		}
	}
}
