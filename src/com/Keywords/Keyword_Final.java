package com.Keywords;

public final class Keyword_Final {
	
	final int a = 10;
	final int b = 20;
	
	public final void sub() {
		
		final int c = a+b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) throws Throwable{
		
		Keyword_Final f = new Keyword_Final();
		System.out.println(f.a);
		System.out.println(f.b);
		f.sub();
		f.finalize();
	}
}
