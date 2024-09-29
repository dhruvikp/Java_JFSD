package com.simplilearn.java11;

public class StringMethodsExample {

	public static void main(String[] args) {
		
		System.out.println("   ".isBlank());
		
		System.out.println("  Hello Simplilearn  ".strip());
		
		"Line1\nLine2\nLine3".lines().forEach(System.out::println);
		
		System.out.println("Simplilearn".repeat(3));

	}

}
