package com.simplilearn.accessSpecifier.pkg1;

public class PrivateExample {
	
	private String secret = "This is private!";
	
	public void revealSecret() {
		System.out.println(secret);
	}
}
