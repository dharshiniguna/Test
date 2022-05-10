package com.String_Functions;

public class String_First_Set {
	
	public static void main(String[] args) {
		
		String s = "welcome to disneyland";
		String s1 = "WELCOME TO DISNEYLAND";
		String s2 = "";
		String s3 = null;
		
		int length = s.length();
		System.out.println(length);  //will count the spaces too
		
		boolean equals = s.equals(s1);
		System.out.println(equals);  // lower and upper case variation
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);  // ignore case sensitive
		
		String upperCase = s.toUpperCase();  //convert from lower to uppercase
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();  //convert from upper to lowercase
		System.out.println(lowerCase);
		
		String replace = s2.replace("", "Hi");   //replace one char with another
		System.out.println(replace);	
	}
}
