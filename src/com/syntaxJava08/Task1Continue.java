package com.syntaxJava08;

import java.util.Scanner;

public class Task1Continue {

	public static void main(String[] args) {
		
		for (int i=1; i<=50; i++) {
			if(i%3==0)
			continue;
			
			System.out.print(i+" ");
			
	}
		System.out.println();
		System.out.println("_______________________________");
		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. Whenever user done with payments program 
		 * should say "Thank you for shopping!"
		 */
		System.out.println("Please Enter item they want to buy");
		Scanner type=new Scanner(System.in);
		type.next();
		System.out.println("Please entert the cost");
		double price=type.nextDouble();
		
		double money;
		double total=0;
		
		do {
			System.out.println("How much money do you have?");
		    money=type.nextDouble();
		    
		    total+=money;
		    double need;
		    double change;
		    
		
		    if(total<price) {
		    	need=price-total;
		    System.out.println("You need to pay more $ "+need);
		    	
		    }else if(total>price) {
		    	change=total-price;
		    	System.out.println("Here is your change $"+change);
		    	break;
		    }
		
	}while(total!=price);
		System.out.println("Thank you for shopping");
	}
}