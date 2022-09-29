package com.syntaxJava08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
        
        System.out.println("_______________________________");
        
        Scanner input=new Scanner(System.in);
        int secretNumber=1234;
        int guessNumber;
        do{
            System.out.println("Please guess the secret number:");
            guessNumber=input.nextInt();
        }while(secretNumber!=guessNumber);
        System.out.println("Congratulations! You won!");
	}
}