package com.syntaxJava13;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*/*Write a program that reads two people's first name
         * if they expecting boy or girl? 
         * Based on the input suggests a name for a baby:
         * 
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? boy
         * Suggested baby name: DANRY
         * 
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? girl
         * Suggested baby name: MAIEL
         */
		Scanner scanner=new Scanner(System.in);
		String motherName="Maysa";
		String fatherName="Arlsan";
		String firstHalf;
		String secondHalf;
		boolean isBoy=false;
		
		System.out.println("Please enter mother's name");
		motherName=scanner.next();
		System.out.println("Please enter the father's name");
		fatherName=scanner.next();
		System.out.println("Are you expecting a boy or a girl?");
		isBoy=scanner.nextBoolean();

        if(isBoy) {
            firstHalf=fatherName.substring(0,fatherName.length()/2);
             secondHalf=motherName.substring(motherName.length()/2);
            System.out.println(firstHalf+secondHalf);
        }else {
             firstHalf=motherName.substring(0,motherName.length()/2);
             secondHalf=fatherName.substring(fatherName.length()/2);

        }
        System.out.println(firstHalf+secondHalf);
			
		
	}

}

