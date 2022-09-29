package Repls;

import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
	/*
	 * Take 2 boolean inputs from a user:
	 "Are you thirsty?"
     "Are you sleepy?"

			If user is thirsty and not sleepy--> drink=water
			If user is thirsty and sleepy--> drink=coffee
            If user is not thirsty and sleepy --> drink=tea
            Otherwise drink="nothing"

			```
			Output:
			```

			- Looks like you need to drink \_\_\_
*/
	Scanner type=new Scanner(System.in);
	System.out.println("Are you thirsty?");
		//boolean thirsty=true;
	    type.nextBoolean();
	    System.out.println("Are you sleepy");
	    //boolean sleepy=false;
	    type.nextBoolean();
	    
	    if(true&&false) {
	    	System.out.println("Looks like you need to drink water");
	    }
	    if(true&&true) {
	    System.out.println("Looks like you need to drink coffee");
	    }
	      if(false&&true) {
		System.out.println("Looks like you need to drink tea");
	      }else if(false&&false){
        	System.out.println("Looks like you need to nothing");
        }
	}

	    }
	
	
