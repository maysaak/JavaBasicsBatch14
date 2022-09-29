package com.syntaxJava10;

public class Task8 {

	public static void main(String[] args) {
		// write a Java program to prin the first 10 numbers of Fibonacci series 
		//0 1 1 2 3 5 8 13 21 
	
		int previous=0;
		int currentNum=1;
		int nextNum=0;
		System.out.println(previous);
		System.out.println(currentNum);
		for(int i=0; i<8;i++) {
			nextNum=previous+currentNum;
			System.out.println(nextNum);
			previous=currentNum;
			currentNum=nextNum;
			
			
			
		}
		
		

	}

}
