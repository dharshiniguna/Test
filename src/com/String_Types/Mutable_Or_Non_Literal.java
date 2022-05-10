package com.String_Types;

public class Mutable_Or_Non_Literal {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Chennai");
		StringBuffer s1 = new StringBuffer("Chennai");
		
		System.out.println((System.identityHashCode(s)));
		System.out.println((System.identityHashCode(s1)));
		
		s1.append(s);
		
		System.out.println(s1);
		
		System.out.println((System.identityHashCode(s1)));
		
	}
}
