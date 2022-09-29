package com.syntaxJava13;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create a string and if the string is not empty perfrom the following
		 * if the string has odd number of characters and has 3 or more characters
		 */
		String str="hello";
		int length=str.length();
		if(!str.isEmpty()&&length%2!=0&&length>=3) {
			
			int middleIndex=length/2;
			System.out.println(str.charAt(middleIndex));
			
			
		}
	}

}
