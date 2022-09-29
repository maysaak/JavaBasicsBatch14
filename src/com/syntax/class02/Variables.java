package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rami";
		String Lastname = "Altawil";
		byte grade = 9;
		String city= "Miami";
		String phone = "305 123 785";
		
		System.out.println("My name is  " +name);
		System.out.println("I am "+grade+ " grade student.");
		System.out.println("I live in city "+city+ ", state FL.");
		System.out.println("And my phone number is  "+phone);
		
		
		//Changes
		
		city = "New York";
		// disregard state = "NY";
		phone = "917 8585 2545";
		grade = 12;
		
		System.out.println("My name is  " +name);
		System.out.println("I am "+grade+ " grade student.");
		System.out.println("I moved from Miami and now I live in city "+city+ ", state NY.");
		System.out.println("And my new phone number is  "+phone);
				
	}

}
