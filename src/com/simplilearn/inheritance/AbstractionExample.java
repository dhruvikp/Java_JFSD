package com.simplilearn.inheritance;

public class AbstractionExample {

	public static void main(String[] args) {
		
		Vehicle v = new Car();
		
		v.drive();
	}

}

abstract class Vehicle {
	abstract void drive();
	
	void stop() {
		System.out.println("Vehicle has stopped!");
	}
}

class Bike extends Vehicle {

	

	@Override
	void drive() {
		System.out.println("Driving using bike");
	}
	
}

class Car extends Vehicle {
	
	void start() {
		System.out.println("Car is starting");
	}
	
	@Override
	void drive() {
		System.out.println("Car driving");
	}
}