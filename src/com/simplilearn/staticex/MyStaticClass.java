package com.simplilearn.staticex;

public class MyStaticClass {

	public static int staticVar = 10;
	
	int instanceVar = 5;
	
	static void staticMethod() {
		System.out.println("Static method called. StaticVar : "+staticVar);
	}
	
	void instanceMethod() {
		System.out.println("Instance method called. instanceVar = "+ instanceVar);
	}
	
	
	public static void main(String[] args) {
		System.out.println(MyStaticClass.staticVar);
		//System.out.println(MyStaticClass.instanceVar);
		MyStaticClass.staticMethod();
		
		MyStaticClass obj = new MyStaticClass();
		obj.instanceMethod();

	}

}
