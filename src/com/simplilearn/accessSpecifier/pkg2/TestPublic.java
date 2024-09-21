package com.simplilearn.accessSpecifier.pkg2;

import com.simplilearn.accessSpecifier.pkg1.PublicExample;

public class TestPublic {

	public static void main(String[] args) {
		PublicExample obj = new PublicExample();
		System.out.println(obj.message);
		obj.displayMessage();

	}

}
