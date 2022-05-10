package com.Array;

public class Array {
	
	public static void main(String[] args) {
		
		// datatype refname [] = new datatype [length];
		
		int a [] = new int [3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		int b [] = new int [3];
		
		b [0] = 40;
		b [1] = 50;
		b [2] = 60;
		
		for (int i : b) {
			
			System.out.println(i);
		}
		
		int c [] = { 70, 80, 90, 100};
		
		for (int i : c) {
			System.out.println(i);
		}		
	}
}
