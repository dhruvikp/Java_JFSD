package com.simplilearn.accessSpecifier.pkg1;

public class DefaultExample {
	String data = "Default Data";
	
	void showData(String data) {
	//	this.test();
		System.out.println(this.data);
		System.out.println(data);
	}
	
	
}
