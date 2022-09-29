package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// String is one of the examples of known primitive data types 
		
		String name= "Maysa";
		
		String address= "2120 Ocean Ave";
		String phone= "917 770 9599";
		
		String age="33";
		
		String character= "M"; //anything in double quote is considered to be string
		
		
//ctr+space=auto completes statement
		//syso+ctrl + space 
		
		System.out.println(name);
		
		//"My name is" + Maysa
		
		System.out.println("My name is "+name);
		
		//Maysa is 33
		System.out.println(name+" is "+age);
		
		String fruit= "apple";
		double price= 1.99;
		
		System.out.println("The price of the " +fruit+" is "+ price);
		
		fruit= "mango";
		price= 5.99;
		System.out.println("The price of the " +fruit+" is "+ price);

		
		/* to attach value (int, double, boolean, char, String) etc
		 * to a string we use +
		 * + next to the String act as Concatenation
		 */
		
		System.out.println(fruit);
		
		
		
	}

}
