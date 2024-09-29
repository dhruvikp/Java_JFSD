package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<String>();
		
		cities.add("New York");
		cities.add("London");
		cities.add("Tokyo");
		cities.add("Paris");
		
		cities.add("New York");
		
		for(String city: cities) {
			System.out.println(city);
		}

	}

}
