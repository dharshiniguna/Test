package com.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		Map <Integer, Object> obj = new HashMap <Integer, Object> ();
		
		obj.put(0,10);
		obj.put(1, "Java");
		obj.put(2,20);
		obj.put(3,"Selenium");
		obj.put(4,30);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Object object = obj.get(3);
		System.out.println(object);
		
		Set<Integer> keySet = obj.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = obj.values();
		System.out.println(values);
		
		boolean containsKey = obj.containsKey(4);
		System.out.println(containsKey);
		
		boolean containsValue = obj.containsValue(30);
		System.out.println(containsValue);
		
		obj.remove(4);
		System.out.println(obj);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet();
		//System.out.println(entrySet);
		
		for (Entry<Integer, Object> entry : entrySet) {
		
			System.out.println(entry);
		}		
	}
}
