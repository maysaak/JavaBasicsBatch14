package com.syntaxJava6;

import java.util.Scanner;

public class EnhanceCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("what time is it?(Please use 24 hour format)");
        double time = scan.nextDouble();
        
        String timeOfTheDay=null;
        

        if (time > 1 && time < 11) {
        	timeOfTheDay ="Morning";            
                 
        } else if (time > 12 && time < 20) {
        timeOfTheDay="Afternoon";
        
        } else if (time > 21 && time < 24) {
            timeOfTheDay ="Night";
        }else {
        	System.out.println("Wrong number is entered");
        	timeOfTheDay= "Invalid";
        	
        }

         System.out.println(timeOfTheDay);
	}

}
