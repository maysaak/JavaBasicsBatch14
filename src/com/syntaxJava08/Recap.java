package com.syntaxJava08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		//print even numbers from 20 to 1(2 ways)
    for (int i=20; i>1; i-=2) {
    	System.out.print(i+ " ");
    }
    System.out.println();
    System.out.println("IF cond inside for loop");
    
    for (int i=20; i>=1; i--) {
   if(i%2==0) {
    System.out.print(i +" ");
    	
   }
	}
System.out.println("______________________________");

for (int i=1; i<=3; i++) {
	Scanner input =new Scanner(System.in);
	System.out.println("Please write a name");
	String name=input.nextLine();
	
	System.out.println("Good afternoon "+ name);
	System.out.println("__________________________________");
	
}
	}
}

