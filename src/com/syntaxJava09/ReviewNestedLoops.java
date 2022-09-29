package com.syntaxJava09;

public class ReviewNestedLoops {

	public static void main(String[] args) {
		//break and continue;
		//break - blocks/exit lopp;
		//continue skips current eecutions
		
		//nested loop = loop inside another loop 
		
		for(int i=1; i<4; i++) {
			for (int j=0; j<=2; j++) {
				System.out.println("Hello");
				break;
			}
			System.out.println("Bye");
			//break;
		}
		
		boolean day =true;
		
		for (int i=1; i<=3;i++) {
			while(day)
				System.out.println("Good Day");
		}
	}

}
