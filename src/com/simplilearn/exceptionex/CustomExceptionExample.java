package com.simplilearn.exceptionex;

public class CustomExceptionExample {

	public static void main(String[] args) {

		try {
			validateAge(20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is not valid, must be 18 or older!");
		}
	}

}
