package com.simplilearn.array;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		int[] anotherArray = new int[5];
		anotherArray[0] = 10;
		
		System.out.println(numbers[0]);
		System.out.println(numbers.length);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
		
		for(int num: numbers) {
			System.out.print(num);
		}
		
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println();
		int element = matrix[1][2];
		System.out.println(element);
		
		

	}

}
