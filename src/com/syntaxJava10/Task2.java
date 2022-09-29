package com.syntaxJava10;


import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type=new Scanner(System.in);
	    System.out.println("Please enter how many countries you would like to store");
	    int size=type.nextInt();
	    String[] countries=new String[size];
	    String[] capitals=new String[size];
	    
	    type.nextLine();
	    for(int i=0;i<size;i++) {
	    	System.out.println("Please enter the country name");
	    	countries[i]=type.nextLine();
	    	
	    	System.out.println("Please enter the capital for "+countries[i]);
	    	capitals[i]=type.nextLine();
	    	
	    }
	    System.out.println(Arrays.toString(countries));
	    System.out.println(Arrays.toString(capitals));
		
	    for(int i=0; i<size;i++) {
	    	
	    	System.out.println("The Country "+countries[i]+" Has the cpaital "+capitals[i]);
	    }
	}

}
