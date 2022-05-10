package com.String_Types;

public class Mutable_String_Builder {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("India");
		StringBuilder s1 = new StringBuilder("India");
		
		System.out.println((System.identityHashCode(s)));
		System.out.println((System.identityHashCode(s1)));
		
		s.append(s1);
		
		System.out.println(s);
		
		System.out.println((System.identityHashCode(s)));
	}
}
