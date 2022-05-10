package com.Condition_Statement;

import java.util.Scanner;

public class Elseif_Grade_System {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = sc.nextInt();
		System.out.println(marks);
		
		if (marks < 40) {
			System.out.println("Fail");
		}
		else if (marks >=40 && marks < 50) {
			System.out.println("D-Grade");
		}
		else if (marks >=50 && marks < 60) {
			System.out.println("C-Grade");
		}
		else if (marks >=60 && marks < 70) {
			System.out.println("B-Grade");
		}
		else if (marks >=70 && marks < 80) {
			System.out.println("B+ - Grade");
		}
		else if (marks >=80 && marks < 90) {
			System.out.println("A-Grade");
		}
		else {
			System.out.println("S-Grade");
		}
		sc.close();
	}
}
