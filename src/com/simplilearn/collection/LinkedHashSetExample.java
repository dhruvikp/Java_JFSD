package com.simplilearn.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> countries = new LinkedHashSet<String>();
		countries.add("USA");
		countries.add("Canada");
		countries.add("India");
		countries.add("Australia");
		
		System.out.println(countries);
		
		countries.add("Canada");
		
		System.out.println(countries);
		
		for(String country: countries) {
			System.out.println(country);
		}		

	}

}
