package com.Collections;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
	
	public static void main(String[] args) {
		
		Set <Integer> obj = new TreeSet <> ();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
//		obj.remove(30);
//		System.out.println(obj);
		
		boolean contains = obj.contains(20);
		System.out.println(contains);
		
//		obj.clear();
//		System.out.println(obj);
		
        Set <Integer> obj1 = new TreeSet <> ();
		
		obj1.add(40);
		obj1.add(50);
		obj1.add(60);
		
//		obj1.addAll(obj);
//		System.out.println(obj1);
		
//		obj1.retainAll(obj);
//		System.out.println(obj1);
		
		obj1.removeAll(obj);
		System.out.println(obj1);		
	}
}
