package com.simplilearn.collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		

		TreeMap<String, Integer> populationMap = new TreeMap<String, Integer>();

		populationMap.put("New York", 8000000);
		populationMap.put("Los Angeles", 3000000);
		populationMap.put("Chicago", 2000000);
		//populationMap.put(null, 0);

		System.out.println(populationMap.get("Los Angeles"));

		for (String city : populationMap.keySet()) {
			// System.out.println(city);
			System.out.println(city + ":" + populationMap.get(city));
		}
		

	}

}
