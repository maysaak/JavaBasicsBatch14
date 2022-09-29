package Repls;

import java.util.Scanner;

public class Reepl35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type =new Scanner(System.in);
		   
		   boolean needLoan=true;
		   System.out.println("Do you need a loan?");
		   boolean eligibility= type.nextBoolean();
		   int score=0;
		   //String out;
		   
		if(needLoan){
		   System.out.println("What is your credit score?");
		   score=type.nextInt();
		   
		 if(score<=600) {
		     System.out.println("The eligibility is Not eligible");
		   }else if(score<=700){
		       System.out.println("The eligibility is Maybe eligible");
		   }else if(score<=800){
		     System.out.println("The eligibility is Eligible");
		   }else {//(score>801);
		     System.out.println("The eligibility is Definitely eligible");
		 }
		 } else {
		  System.out.println("Unkown");
		 
		 }
		}
		

	

}
