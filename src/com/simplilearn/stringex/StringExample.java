package com.simplilearn.stringex;

public class StringExample {

	public static void main(String[] args) {
		
		String str = "Java";
		
		int len = str.length(); // 4
		
		str.charAt(0); // 'J'
		
		str.substring(1,3); // av , including 1 and excluding 3
		
		String str1 = "    Java    ";
		
		System.out.println(str.equals(str1));
		
		String str2 = new String("Java");
		System.out.println(str1.equals(str2));
		
		String replacedStr = str.replace('J', 'Y');
		
		String str3 = "Hello";
		String str4 = "World";
		String result = str3 + " "+ str4;
		System.out.println(result);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		sb.append(" World !");
		
		System.out.println(sb.toString());
		
		
		

	}

}
