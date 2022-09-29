package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		
		//1 way to create a variable
		byte b=100; //created a variable and assigned value together
		
		//2 way to create a variable
		int i; //saying reserve a space for me and in that space i will be creating value which i dotn have yet 
		i=100; //assign value to i 
		
		//we need to create variable only once 
		//then we can use it as many times as we need 
		
		//3 way
		int num1, num2, num3;
		
		num1= 100;
		num2=300; //assign the value 
		num3=500;
		
	//int num1=100; error -> duplicate variable 
		
		// can i change a value of a variable?
		
		num2 = 2000; //reassign the value 
		
		System.out.println(num2);
				

	}

}
