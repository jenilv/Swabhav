package com.techlabs.basic.app;

import java.util.Map;
import java.util.TreeMap;

public class NumberTest {

	public static void main(String[] args) {
		findOccurrences(new int[] { 10, 20, 30, 10, 20, 22, 33, 44 });
	}

	public static void findOccurrences(int[] array) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : array) {
			if (map.get(i) != null) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			System.out.println(i.getKey() + "->" + i.getValue());
		}
	}
}
