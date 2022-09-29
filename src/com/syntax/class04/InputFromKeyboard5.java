package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
    Scanner body = new Scanner(System.in);
    System.out.println("Did you solve Repls Assignment?");
    boolean solvedAnyRepls=body.nextBoolean();
    
    if(solvedAnyRepls)
    {
    System.out.println("How many tasks did you finish?");
    int noReplsSolved =body.nextInt();
    
    if(noReplsSolved>=17)
    {
    System.out.println("You are doing a great job");
    
    }else if(noReplsSolved<17) {
    	System.out.println("You need to finish the rest");
    
    }else
    {
    	
    
	}
    System.out.println("Go do your homework");
    
}
}
}