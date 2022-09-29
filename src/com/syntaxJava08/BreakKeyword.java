package com.syntaxJava08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<15; i++) {
			System.out.println("Hello");
			if(i==3) {
				break;
			}

		//break - breaks the loop and usually inside of a condition 
		}
		
		boolean hungry=true;
		while(hungry) {
			System.out.println("Give me food");
			break;
			
		}
         System.out.println("End");
	}

}
