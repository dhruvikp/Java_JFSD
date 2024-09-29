package com.simplilearn.collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		System.out.println(fruits.get(0));
		
		fruits.remove("Banana");
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}

	}

}
