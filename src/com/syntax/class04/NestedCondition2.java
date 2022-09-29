package com.syntax.class04;

public class NestedCondition2 {

	public static void main(String[] args) {

    double moneyInMyAccount =250;
    String season="Spring";
    
    if(season.equals("Spring"))
    {
    	
    	if(moneyInMyAccount >30000)
    	{
    	System.out.println("Lets go on vacation to Bali");
    }else {
    	System.out.println("Cant go until Novemeber");
    }

     }
	}
	
}

