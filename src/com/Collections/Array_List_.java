package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List_ {
	
	public static void main(String[] args) {
		
		List<Object> obj = new ArrayList<Object>();
		
		obj.add("Java");
		obj.add(10);
		obj.add(20.33);
		obj.add('A');
		obj.add(10);
		obj.add("Java");
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Object object = obj.get(4);
		System.out.println(object);
		
		obj.set(3, "Apple");
		System.out.println(obj);
		
//		obj.remove(2);
//		System.out.println(obj);
		
		int indexOf = obj.indexOf("Java");
		System.out.println(indexOf);
		
		boolean contains = obj.contains("Apple");
		System.out.println(contains);
		
//		obj.clear();
//		System.out.println(obj);
		
        List <Object> obj1 = new ArrayList <Object>();
		
		obj1.add("Python");
		obj1.add(10);
		obj1.add(20.33);
		obj1.add('B');
		obj1.add(10);
		obj1.add("Oracle");
		
//		obj1.addAll(obj);
//		System.out.println(obj1);
//		
//		obj1.retainAll(obj);
//		System.out.println(obj1);
//		
		obj1.removeAll(obj);
		System.out.println(obj1);		
	}
}