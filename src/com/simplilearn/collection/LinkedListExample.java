package com.simplilearn.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.addFirst(5);
		numbers.addLast(40);
		
		for(Integer num: numbers) {
			System.out.println(num);
		}
		
		numbers.remove(2);

	}

}
 