package com.simplilearn.exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("test.txt");
			int data = fis.read();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	

	}

}
