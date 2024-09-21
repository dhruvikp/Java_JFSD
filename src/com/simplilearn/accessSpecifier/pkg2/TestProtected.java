package com.simplilearn.accessSpecifier.pkg2;

import com.simplilearn.accessSpecifier.pkg1.ProtectedExample;

public class TestProtected {

	public static void main(String[] args) {
		
	}

}

class SubclassExample extends ProtectedExample {
	public void showInfo() {
		System.out.println(info);
		displayInfo();
	}
}
