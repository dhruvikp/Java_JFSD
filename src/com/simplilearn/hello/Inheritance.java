package com.simplilearn.hello;

import com.simplilearn.staticex.MyStaticClass;

public class Inheritance {
	//int a = 5;
	

	public static void main(String[] args) {
	
		Puppy myDog = new Puppy();
		
		myDog.eat();
		myDog.bark();
		
		myDog.weep();
		
		System.out.println(MyStaticClass.staticVar);
	 
	}

}

class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks!");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Cat meows");
	}
}

class Puppy extends Dog {
	void weep() {
		System.out.println("Puppy weeps");
	}
}



