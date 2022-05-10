package org.Scanner;

import java.util.Scanner;

public class Scanner_Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PIN number:");
		int PIN = sc.nextInt();
		System.out.println(PIN);
		
		System.out.println("Select Account Type:");
		String Type = sc.next();
		System.out.println(Type);
		
		System.out.println("Enter Amount:");
		int Amount = sc.nextInt();
		System.out.println(Amount);
		
		System.out.println("Check Balance Yes or No:");
		String Check = sc.next();
		System.out.println(Check);
		
		System.out.println("Available Balance:");
		double Balance = sc.nextDouble();
		System.out.println(Balance);
		
		sc.close();
	}
}
