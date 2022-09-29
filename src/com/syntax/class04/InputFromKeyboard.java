package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us to tjae tge input from the keyboard 
		 * it contains many different smallers modules called methods that 
		 * can help us take Strings booleans basically all types of data from
		 * the keyboard
		 */
		Scanner input =new Scanner(System.in);
		//A message will be displayed to the user on the console to enter their name
		System.out.println("Please enter your name");
		// Activates the java program to take the input from the keyboard and store
		//it inside the name variable
        String name=input.next(); //takes only word from keyboard
        System.out.println("Hello "+name);
        //prints whatever name user enters on the keyboard on the console 
        
        System.out.println("Hello "+name+" How can i help you");
        

	}

}
