package com.simplilearn.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> populationMap = new LinkedHashMap<String, Integer>();

		populationMap.put("New York", 8000000);
		populationMap.put("Los Angeles", 3000000);
		populationMap.put("Chicago", 2000000);
		populationMap.put(null, 0);

		System.out.println(populationMap.get("Los Angeles"));

		for (String city : populationMap.keySet()) {
			// System.out.println(city);
			System.out.println(city + ":" + populationMap.get(city));
		}

	}
}
