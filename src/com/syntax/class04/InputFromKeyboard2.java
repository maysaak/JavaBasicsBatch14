package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Please enter any sentence");
		String sentence= keyboard.nextLine();
		System.out.println(sentence);
		

	}

}
