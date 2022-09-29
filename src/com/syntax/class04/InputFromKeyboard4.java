package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		Scanner keybaord =new Scanner(System.in);
		System.out.println("Please enter your name");
        String name =keybaord.nextLine();
		System.out.println("Please enter your age");
        int age =keybaord.nextInt();
        
		System.out.println("Hi "+name+ " you are "+age+" old");

	}

}
