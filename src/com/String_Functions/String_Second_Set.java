package com.String_Functions;

public class String_Second_Set {
	
	public static void main(String[] args) {
		
		String s = "welcome to disneyland";
		String s1 = "WELCOME TO DISNEYLAND";
		String s2 = "";
		String s3 = null;
		
		boolean startsWith = s.startsWith("w");   
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("D");
		System.out.println(endsWith);
		
		boolean contains = s1.contains("TO");
		System.out.println(contains);
		
		int indexOf = s1.indexOf("Y");                  //index position of a char
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("o");   //last index position of a char
		System.out.println(lastIndexOf);
		
		char charAt = s1.charAt(11);                // take char from index numbered position
		System.out.println(charAt);
	}
}
