package com.Keywords;

public class Keywords {
	
	static int a = 10;
	static int b;
	
	public static void add() {
      int c = 20;
      int d = 30;
      int e = c+d;
      
      System.out.println(e);
	}
    
	static {
		System.out.println("Java");
	}
	   
	public static void main(String[] args) {
		 
		System.out.println(a);
		System.out.println(b);
		add();
	}
	
	static {
		System.out.println("Selenium");
	}
}
