package com.techlabs.assignments;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {

		mostFrequentElement(new int[] { 4, 5, 8, 7, 4, 7, 6, 7 });
	}

	private static void mostFrequentElement(int[] array) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}

		Integer maxKey = null;

		for (Integer key : map.keySet()) {
			if (maxKey == null || map.get(key) > map.get(maxKey)) {
				maxKey = key;
			}
		}

		System.out.println("The most frequent element " + maxKey);
		System.out.println("Its frequency " + map.get(maxKey));
	}
}
