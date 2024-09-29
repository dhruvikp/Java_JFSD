package com.simplilearn.java11;

import java.util.List;

public class CollectionsToArrayExample {

	public static void main(String[] args) {
		
		List<String> list = List.of("Java","Python","C++");
		String[] array = list.toArray(String[]::new);
		for(String str: array) {
			System.out.println(str);
		}
		

	}

}
