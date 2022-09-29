package com.syntaxJava6;

import java.util.Scanner;

public class HWClass06 {

	public static void main(String[] args) {
		
		Scanner type =new Scanner(System.in);
		
		System.out.println("Please enter the country you are from");
		String country=type.nextLine();
		System.out.println("What language do you speak?");
		String language=type.nextLine();
        System.out.println("Please enter grade");
		String grade=type.nextLine();

		
		//String language;
		
		switch(grade) {
		
		case "A":
		grade="A-Excellent";
		break;
		case "B":
			grade= "B-Good";
		break;
		case "C":
		grade="C-Average";
		break;
		case "D":
		grade="D-Bad";
		break;
		default:
	    grade= "Uknown";
			break;
		}
			
			System.out.println("You have "+grade);
			
	        System.out.println("___________________");
			//scanner type2 =new Scanner(System.in);
			
			if(grade=="A") {
			
			} System.out.println("You have A-Excellentt"); 
			
	       }else if(grade=="B") {
	    	   
           }System.out.println("You have B-Good"); 
	
			
			//}else if(grade=="C") 
				
			//{System.out.println("You have C-Average");
				
			}
			
			}
		
			
		



	
	



