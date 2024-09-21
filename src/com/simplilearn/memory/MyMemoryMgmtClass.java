package com.simplilearn.memory;

public class MyMemoryMgmtClass {

	int value = 5;
	
	void myMethod() {
		int x = 5;
		System.out.println("My Mehtod invoked");
		A();
		System.out.println("A myMehodEnded");
	}
	
	void A() {
		System.out.println("A");
		B();
		System.out.println("A ended");
	}
	
	void B() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		MyMemoryMgmtClass obj = new MyMemoryMgmtClass();
		obj.myMethod();
		System.out.println("From Main all ended");
		System.out.println("Main eneded");
	}

}
