package com.Looping;

import java.util.Scanner;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		System.out.println(n);
		
		int a = n;
		int rem = 0;
		int ans = 0;
		
		while (n>0) {
			rem = n % 10;
			ans = ans + (rem*rem*rem);
		    n = n / 10;
		}
		
		if (ans == a) {
			
			System.out.println("Armstrong Number");
			
		} else {
            System.out.println("Not an Armstrong Number");
		}
		
		sc.close();
	}
}
