package com.Condition_Statement;

import java.util.Scanner;

public class Odd_Even_Ifelse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println(number);
		
		if (number % 2 ==0) {
			
			System.out.println("Even Number");
			
		} else {
			
			System.out.println("Odd Number");
		}	
		sc.close();
	}
}
