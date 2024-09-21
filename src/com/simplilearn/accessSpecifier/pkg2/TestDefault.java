package com.simplilearn.accessSpecifier.pkg2;

import com.simplilearn.accessSpecifier.pkg1.DefaultExample;

public class TestDefault {

	public static void main(String[] args) {
		DefaultExample obj = new DefaultExample();
		//System.out.println(obj.data);  ERROR: data has default scope
		// obj.showData();

	}

}
