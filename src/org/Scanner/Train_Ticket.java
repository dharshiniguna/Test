package org.Scanner;

import java.util.Scanner;

public class Train_Ticket {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Enter Passenger Name:");
		String Name = t.nextLine();
		System.out.println(Name);
		
		System.out.println("Select seat number:");
		int Seat = t.nextInt();
		System.out.println(Seat);
		
		System.out.println("Contact number:");
		long Contact = t.nextLong();
		System.out.println(Contact);
		
		System.out.println("Boarding Location:");
		String Boarding = t.next();
		System.out.println(Boarding);
		
		System.out.println("Ticket Cost:");
		double Cost = t.nextDouble();
		System.out.println(Cost);
		
		t.close();
	}
}
