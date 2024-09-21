package com.simplilearn.inheritance;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Bouncable {
	void bounce();
}

class Ball implements Bouncable {

	
	public void bounce() {
		
	}
}

class Tire implements Bouncable {

	@Override
	public void bounce() {
			
	}
}