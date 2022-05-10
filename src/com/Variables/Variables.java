package com.Variables;

public class Variables {
	
	
	public void add() {   // Local Variable
       int a = 11;
       int b = 12;
       h = 14;            // local int removed, changed to class variable
       int i = 15;
       System.out.println(a);
       System.out.println(b);
       System.out.println(e);   //Class variable calling method 1, inside method
       System.out.println(h);   //Class variable calling method 1, inside method
       System.out.println(i);
	}
	
	int c;     // class variable
	int d = 10;  // class variable
	int e = 13;  // class variable
	int h = 14;   // class variable, derive from local method
	int i = 18;   // calls local only since ref name same for both class and local
	static int f = 16;   // static variable
	
	public static void sub() {  //static method
		
		int g = 17;
        System.out.println(g);
	}
	
	public static void main(String[] args) {
		
		Variables v = new Variables();
		System.out.println(v.c);   //Class variable calling method 2
		System.out.println(v.d);   //Class variable calling method 2
		v.add();                 //local
		System.out.println(f); // static variable calling without object
		sub();                 // static method calling without object
	}		
}
