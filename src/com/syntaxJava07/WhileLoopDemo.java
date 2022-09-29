package com.syntaxJava07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int time =10;
		if(time<12) {
			System.out.println("Good morning inside if");
		}
		//infinite loop it will jus run non stop 
		
		while (time>12) {
			System.out.println("Good morning inside while loop");
			time++;
			
		}
	}

}
