package com.simplilearn.exceptionex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPropagationExample {

	public static void method1() throws FileNotFoundException {
		int result = 10/0;
		FileInputStream fis = new FileInputStream(new File("test.txt")) ;
	}
	
	public static void method2() throws FileNotFoundException {
		method1();
	}
	
	public static void main(String[] args)  {
			
			try {
				method2();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (Exception e) {
				
			} finally {
				System.out.println(" i wil get executed..");
			}
			
		System.out.println("Program ends");

	}

}
