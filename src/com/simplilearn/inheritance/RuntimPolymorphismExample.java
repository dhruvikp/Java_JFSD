package com.simplilearn.inheritance;

public class RuntimPolymorphismExample {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		Animal ani = new Dog();
		ani.sound();
	}

}

class Animal {
	void sound() {
		System.out.println("This animal makes a sound");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("The dog barks");
	}
}

