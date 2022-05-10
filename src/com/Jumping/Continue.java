package com.Jumping;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i++) {
			
			if (i == 5) {
				continue;
			}
			if (i==10) {
				continue;
			}
			if (i == 15) {
				continue;
			}
			if (i ==20) {
				continue;
			}
			System.out.println(i);
		}		
	}
}
