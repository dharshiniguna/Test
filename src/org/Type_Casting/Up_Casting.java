package org.Type_Casting;

public class Up_Casting {
	
	public static void main(String[] args) {
		
		//Widening ---> Small datatype to big datatype conversion
		
		byte b = 10;
		
		long l = b;
		
		System.out.println(l);
		
		// narrowing ----> big to small datatype conversion
		
		long o = 8428775303l;
		
		byte y = (byte) o;
		
		System.out.println(y);
	}
}
