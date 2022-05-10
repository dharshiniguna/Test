package com.String_Types;

public class ImMutable_Or_Literal {
	
	public static void main(String[] args) {
		
		String s = "Dharshini";
		String s1 = "Dharshini";
		
		System.out.println((System.identityHashCode(s)));
		System.out.println((System.identityHashCode(s1)));
		
		s = s+s1;
		
		System.out.println(s);
		
		System.out.println((System.identityHashCode(s)));	
	}
}
