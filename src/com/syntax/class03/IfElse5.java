package com.syntax.class03;

public class IfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money =60000;
		
		if(money >=65000) {
			System.out.println("I can buy AMG GTS 63");
		}else {
			System.out.println("you can only buy cheap Tesla");
			
		}
	
		
		if(money ==60000) { //== used only when the value is exactly the same 
			System.out.println("I can buy AMG GTS 63");
		}else {
			System.out.println("you can only buy cheap Tesla");
			
		}
		
		int money1 =85000;
		if(money1 <=60000) { 
			System.out.println("I can buy AMG GTS 63");
		}else {
			System.out.println("you can only buy cheap Tesla");
		}
		
		
	}

}
