package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
	
	public static void main(String[] args) {
		
		Set <Object> obj = new HashSet <Object>();
		
		obj.add("Java");
		obj.add("Selenium");
		obj.add(10);
		obj.add(20.33);
		obj.add(null);
		obj.add(10);
		obj.add(null);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
//		obj.remove(null);
//		System.out.println(obj);
		
		boolean contains = obj.contains(20.33);
		System.out.println(contains);
		
//		obj.clear();
//		System.out.println(obj);
		
        Set <Object> obj1 = new HashSet <Object>();
		
		obj1.add("Python");
		obj1.add("Selenium");
		obj1.add(20);
		obj1.add(4.5);
		obj1.add(null);
		obj1.add(10);
		obj1.add(null);
		
//		obj1.addAll(obj);
//		System.out.println(obj1);
		
//		obj1.retainAll(obj);
//		System.out.println(obj1);
		
		obj1.removeAll(obj);
		System.out.println(obj1);
		
	}
}
