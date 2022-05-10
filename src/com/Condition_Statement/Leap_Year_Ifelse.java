package com.Condition_Statement;

import java.util.Scanner;

public class Leap_Year_Ifelse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		System.out.println(year);
		
		if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)) {
			
			System.out.println("Leap year");
			
		} else {

			System.out.println("Not Leap year");
		}	
		sc.close();
	}	
}
