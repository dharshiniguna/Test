package com.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set {
	
	public static void main(String[] args) {
		
		Set <Object> obj = new LinkedHashSet <Object> ();
		
		obj.add("Apple");
		obj.add(50);
		obj.add(10.5);
		obj.add('O');
		obj.add(null);
		obj.add(50);
		obj.add(null);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		obj.remove(null);
		System.out.println(obj);
		
		boolean contains = obj.contains('O');
		System.out.println(contains);
		
//		obj.clear();
//		System.out.println(obj);
		
        Set <Object> obj1 = new LinkedHashSet <Object> ();
		
		obj1.add("Guava");
		obj1.add(60);
		obj1.add(10.5);
		obj1.add("Orange");
		obj1.add(null);
		obj1.add(50);
		obj1.add(null);
		
//		obj1.addAll(obj);
//		System.out.println(obj1);
		
//		obj1.retainAll(obj);
//		System.out.println(obj1);
		
		obj1.removeAll(obj);
		System.out.println(obj1);		
	}
}
