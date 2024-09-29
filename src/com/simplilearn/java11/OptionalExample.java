package com.simplilearn.java11;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(optional.isEmpty());
	}

}
