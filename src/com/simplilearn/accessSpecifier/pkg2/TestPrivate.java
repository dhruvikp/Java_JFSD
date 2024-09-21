package com.simplilearn.accessSpecifier.pkg2;

import com.simplilearn.accessSpecifier.pkg1.PrivateExample;

public class TestPrivate {

	public static void main(String[] args) {
		PrivateExample obj = new PrivateExample();
		// System.out.println(obj.secret);
		obj.revealSecret();

	}

}
