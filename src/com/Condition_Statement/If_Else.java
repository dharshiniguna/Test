package com.Condition_Statement;

import java.util.Scanner;

public class If_Else {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		System.out.println(age);
		
		if (age >=18) {
			
			System.out.println("Eligible for Vote");
		}
		
		else {
			System.out.println("Not eligible for vote");
		}
		sc.close();
	}
}
