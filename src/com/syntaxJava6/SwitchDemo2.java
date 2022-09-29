package com.syntaxJava6;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//matching cases must of same data type as a variable 
		
		char choice ='K';
		String answer;
		
		switch(choice) {
		case 'Y': 
			answer="Yes";
			break;
			
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
			
			default:
				answer="unknown";
				break;
				
		}
   System.out.println(answer);
	}
/*
 * switch case cannot use logical operators 
 * switch case cannot use relational operators 
 
 */
	/* CANNOT work with boolean values 
	 * Cannot work with decimals/
	 */
}
