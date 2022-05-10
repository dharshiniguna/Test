package com.Looping;

import java.util.Scanner;

public class While_Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int n = sc.nextInt();
		System.out.println(n);
		
		int a = n;
		int rem = 0;
		int ans = 0;
		
		do {
			rem = n % 10;
			ans = ans*10+rem;
			n = n/10;
		} while (n>0);
		
		if (ans == a) {
			
			System.out.println("Palindrome number");
			
		} else {
			
			System.out.println("Not a Palindrome number");
		}
		sc.close();
	}  
}
