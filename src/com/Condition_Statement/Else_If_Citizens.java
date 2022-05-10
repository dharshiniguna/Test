package com.Condition_Statement;

import java.util.Scanner;

public class Else_If_Citizens {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		System.out.println(age);
		
		if (age <= 5) {
			System.out.println("Baby");
		}
		else if (age > 5 && age <=16) {
			System.out.println("Child");
		}
		else if (age > 16 && age <= 24) {
			System.out.println("Young Adults");
		}
		else if (age > 24 && age <= 45) {
			System.out.println("Middle-aged adults");
		}
		else if (age > 45 && age < 60) {
			System.out.println("Old Adults");
		}
		else {
			System.out.println("Senior Citizens");
		}
		sc.close();
	}
}
