package com.Switch;

public class Switch_Program {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		switch (i) {
		case 0:
			System.out.println("Theft Case");
			break;
			
		case 1:
			System.out.println("Murder Case");
			break;
			
		case 2:
			System.out.println("Civil case");
			break;

		default:
			System.out.println("Invalid case number");
			break;
		}
	}
}
