package com.simplilearn.inheritance;

public class Calculator_CompileTimeInheritance {

	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator_CompileTimeInheritance calc = new Calculator_CompileTimeInheritance();
		int val = calc.add(2,3);
		System.out.println(val);
		
		val = calc.add(1,2,3);
		System.out.println(val);
	} 
}
