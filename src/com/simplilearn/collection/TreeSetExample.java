package com.simplilearn.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		//numbers.add(null); // Adding null is not allowed
		
		for(Integer num: numbers) {
			System.out.println(num);
		}

	}

}
