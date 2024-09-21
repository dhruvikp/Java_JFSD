package com.simplilearn.constructor;

public class ConstructorExample {

	public static void main(String[] args) {
		DefaultConstructorExample obj = new DefaultConstructorExample();
		System.out.println(obj.name);
		
		ParameterizedConstructorExample obj1 = new ParameterizedConstructorExample("Arati");
		System.out.println(obj1.name);
		
		ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample();
		System.out.println(obj2.name);
		
		ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample("Alex");
		System.out.println(obj3.name);
		
		Child obj4 = new Child();
		
		
	}
}

class DefaultConstructorExample {
	String name;

	// Compiler will create default no argument constructor in case you haven't declared!
}

class ParameterizedConstructorExample {
	String name;

	public ParameterizedConstructorExample(String name) {
		this.name = name;
	}
}

class ConstructorOverloadingExample {
	String name;

	public ConstructorOverloadingExample() {
		this.name = "Simplilearn";
	}
	
	public ConstructorOverloadingExample(String name) {
		this.name = name;
	}
}


class Parent {
	public Parent(String s) {
		super();
		System.out.println("Parent constructor");
	}
	
}

class Child extends Parent {
	public Child() {
		super("");
		System.out.println("Child constructor");
	}
}

