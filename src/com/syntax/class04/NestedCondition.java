package com.syntax.class04;

public class NestedCondition {

	public static void main(String[] args) {
		int time=5;
		String day ="Monday";
		
		if(day.equals("Monday")) { //since string is non primitive we have to write equals.to and not = 
			/*it is called outter if condition if it is true then only inner conditions will be checked
			 * like in a building - the main doot 
			 */
			if(time>7) {
				System.out.println("Lets go to office");
				
			}
			
			if(time<6) {
				System.out.println("Lets Sleep some more");
			}
		}
		
		

	}

}
