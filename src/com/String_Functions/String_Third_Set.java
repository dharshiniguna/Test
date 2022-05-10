package com.String_Functions;

public class String_Third_Set {
	
	public static void main(String[] args) {
		
		String s = "welcome to disneyland";
		String s1 = "WELCOME TO DISNEYLAND";
		String s2 = "";
		String s3 = "  Hello";
		
		String substring = s.substring(11);   //print only from this string
		System.out.println(substring);
		
		boolean empty = s2.isEmpty();     
		System.out.println(empty);
		
		String trim = s1.trim();          //trims spaces after or before
		System.out.println(trim);
		
		String replace = s3.trim().replace("Hello", "Hi");            
		System.out.println(replace);
		
		int compareTo = s.compareTo(s1);      //compare ASCII value of two chars
		System.out.println(compareTo);
		
		String[] split = s.split("e");      //removes all mentioned char
		
		for (String string : split) {
			
			System.out.print(string);
		}
	}
}
