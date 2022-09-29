package com.syntaxJava6;

import java.util.Scanner;

public class Whatever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        System.out.println("Please tell me where you are from?");
        String country=in.nextLine();
        String favoriteFood;

        switch (country) {
		case "usa":
			favoriteFood= "burgers and fries";
			break;
		case "italy":
			favoriteFood="pasta";
			break;
		case "turkey":
			favoriteFood ="Adana kebab";
			break;
		case "france":
			favoriteFood ="Croisant";
			break;
		case "saudi":
			favoriteFood ="pilov";
			break;
		case "brazil":
			favoriteFood="pizza";
		break;
			default:
				favoriteFood="unknown";
		}
		
		System.out.println("You are from "+ country+ " and your favorite food is " +favoriteFood);
    }
	}


