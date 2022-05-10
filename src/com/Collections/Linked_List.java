package com.Collections;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	public static void main(String[] args) {
		
		List <Object> obj = new LinkedList <Object>();
		
		obj.add("Chennai");
		obj.add("Mumbai");
		obj.add(100);
		obj.add(99.4);
		obj.add('B');
		obj.add(100);
		obj.add("Mumbai");
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Object object = obj.get(3);
		System.out.println(object);
		
		obj.set(4, "Bombay");
		System.out.println(obj);
		
//		obj.remove(6);
//		System.out.println(obj);
		
		int indexOf = obj.indexOf(100);
		System.out.println(indexOf);
		
		boolean contains = obj.contains('B');
		System.out.println(contains);
		
//		obj.clear();
//		System.out.println(obj);
		
        List <Object> obj1 = new LinkedList <Object>();
		
		obj1.add("Pondicherry");
		obj1.add("Pune");
		obj1.add(99);
		obj1.add(20.21);
		obj1.add('B');
		obj1.add(100);
		obj1.add("Mumbai");
		
//		obj1.addAll(obj);
//		System.out.println(obj1);
	
//		obj1.retainAll(obj);
//		System.out.println(obj1);
		
		obj1.removeAll(obj);
		System.out.println(obj1);	
	}
}
