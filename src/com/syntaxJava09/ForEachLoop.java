package com.syntaxJava09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//only when we deal with arrays or collections 
		//we can use for each loop, enhanced for loop, advanced for loop 
		
		String[] iceCream= {"vanilla", "chocolate", "pistachio", "kulfi", "mango"};
		
		for(String flavor:iceCream) {
			System.out.println(flavor);
			
			
		}
	}

}
