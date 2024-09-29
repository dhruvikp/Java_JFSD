package com.simplilearn.exceptionex;

public class UncheckedException {

	public static void main(String[] args) {
		String str = null;

		try {
			System.out.println(str.length());	
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Program ends");
		
		
		int[] arr = new int[5];
		if(arr.length>10) {
			arr[10] = 50;	
		} 
		
		System.out.println(6/0);
	}

}
