package com.simplilearn.collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> populationMap = new HashMap<String, Integer>();
		
		populationMap.put("New York", 8000000);
		populationMap.put("Los Angeles", 3000000);
		populationMap.put("Chicago", 2000000);
		populationMap.put(null, 0);
		
		System.out.println(populationMap.get("Los Angeles"));
		
		for(String city: populationMap.keySet()) {
			//System.out.println(city);
			System.out.println(city+ ":" + populationMap.get(city));
		}
		
		
		

	}

}
