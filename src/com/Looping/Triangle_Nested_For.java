package com.Looping;

public class Triangle_Nested_For {

public static void main(String[] args) {
		
		for (int i = 0; i <=4; i++) {
			
			for (int j = 5 - i; j >=1; j--) {
				
				System.out.print(" ");				
			}
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print("* ");		
			}
			System.out.println();
		}
		
		for (int i = 0; i <=4; i++) {
			
			for (int j = 5 - i; j <=5; j++) {
				
				System.out.print(" ");	
			}
			for (int j = 4; j >=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
