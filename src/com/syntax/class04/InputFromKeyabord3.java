package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyabord3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age= scanner.nextInt();
	
		
		if(age<18) 
		{
			System.out.println("You should Study");
		}else {
			System.out.println("You should find a job");
		}
		
	}

}
