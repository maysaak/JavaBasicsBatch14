package com.syntaxJava10;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Create a 2D Array of inter values. Print the sum of all numbers
		
		int [][] ber= {
				{10,10,10,20},
				{25,30,54},
				{20,30},
				
		};
		int sum=0;
		
		for(int[] ar:ber) {
			for(int num:ar ) {
				sum+=num;
				
			}
			
		}
		System.out.println(sum);
	}

}
