package com.syntaxJava6;

import java.util.Scanner;

public class HW2Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner type=new Scanner(System.in);
		System.out.println("please enter a number");
		int a=type.nextInt();
		System.out.println("Please enter another number");
		int b=type.nextInt();
		System.out.println("Please enter operator");
		char c=type.next().charAt(0);
		
		
		int result=0;
		
	if(c=='*') {
		result=a*b;
	}else if(c=='-') {
			result=a-b;
	}else if(c=='+') {
			result=a+b;
	}
	
     System.out.println("The result is "+result);
     System.out.println("________________________");
     
     switch (c) {
     case '*':
    	 result=a*b;
    break;
    
     case'+':
    	 result=a+b;
    	 break;
     case'-':
    	 result=a-b;
    	 break;
    	 default:
         result=0;
    	 break;
     }
    	 System.out.println("The result is "+result);
     
    	 
    	 
    	 
    	 
     }
     
     

	}
	

