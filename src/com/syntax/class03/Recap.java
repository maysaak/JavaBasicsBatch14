package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		
		/*
		 * String concatatenation helps us to combine a String any primitive data type together
		 * 
		 */
		
		String firstName ="Maysa";
		String lastName ="Ak";
		String fullName =firstName+ " " +lastName;
		
		System.out.println(fullName);
		
		int houseNo =19;
		int streetNo = 2120;
		String building = "That building";
		String city ="NYC";
		String country ="USA";
		String fullAddress =houseNo+"  "+streetNo+"  "+building+" "+city+" "+country;
		
		
		System.out.println(fullAddress);
		
		//Code works from top to bottom and from left to right 
		//if we concatenate a string with int = it will be a string
		//= System.out.println("if we sum 5 plus we get"+ 5+5); = NOT Going to work 
		
		System.out.println("if we sum 5 plus we get "+ (5+5));
		
	}

}
