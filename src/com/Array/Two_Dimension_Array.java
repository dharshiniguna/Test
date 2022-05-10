package com.Array;

public class Two_Dimension_Array {
	
	// datatype refname [] [] = new datatype [length] [length];
	
	public static void main(String[] args) {
		
		int a [] [] = new int [3][3];
		
		a [0][0] = 1;
		a [0][2] = 1;
		a [1][1] = 2;
		a [2][0] = 3;
		a [2][2] = 3;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				System.out.print(a [i][j]+" ");
			}
			System.out.println();
		}		
	}
}
