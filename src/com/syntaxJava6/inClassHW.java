package com.syntaxJava6;

import java.util.Scanner;

public class inClassHW {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			
	        System.out.println("Enter your birth month");
	        String month = scan.nextLine();
	        String seasonOftheYear=null;
	        
	        if (month.equals("December") || month.equals("January")  ||month.equals("February")) {
	        	seasonOftheYear= "Winter";
	        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
	        	 seasonOftheYear="Spring";
	        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
	        	 seasonOftheYear="Summer";
	        } else if (month.equals("September")||  month.equals("October") || month.equals("November")) {
	        	 seasonOftheYear ="Autumn";
		}else {seasonOftheYear="Invalid";}
	        
			System.out.println("You were born is season " +seasonOftheYear);
		}


}

