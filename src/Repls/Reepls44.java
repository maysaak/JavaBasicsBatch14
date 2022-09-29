package Repls;

import java.util.Scanner;

public class Reepls44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type=new Scanner(System.in);
	    System.out.println("Please enter your favorite car make");
	    String carOrigin=type.nextLine();
	    String answer;
	    
	  switch(answer) {
	  
	  
	  
	    
	    case "BMW":
	          answer="german car";
	        break;
	        
	    case "Toyota":
	          answer="japanese car";
	        
	        break;
	    case "Maserati":
	          answer="italian car";
	        break;
	        
	        default:
	          answer="unknown";
	        break;
	    }
	    System.out.println("Your favorite car is "+answer);
	    
	 
	  }
	}


