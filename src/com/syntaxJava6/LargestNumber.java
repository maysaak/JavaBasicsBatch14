package com.syntaxJava6;

public class LargestNumber {

	public static void main(String[] args) {
	
			//find the largest number 
		//find if the largest number even or odd 
			boolean understandJava=false;
			boolean enjoyJava=true;
			boolean practice=true;
			
			if(understandJava && enjoyJava && practice) {
				System.out.println("This is awesome");
				
				int n1=100;
				int n2=200;
				int n3=300;
				int largest =0; 
				
				if(n1>n2 && n1>n3) {
					largest =n1;
				}else if(n2>n3 && n2>n1) {
					largest =n2;
				}else if (n3>n1 && n3>n2) {
					largest =n3;	
				}
				//System.out.println(largest +"is the largest number");
				if (largest!=0) {
					
				
				if(largest%2==0) {
					System.out.println(largest+ "is the even number");
				}else {
					System.out.println(largest+ "is odd number");
				}
				}
			}
	}	
	}


