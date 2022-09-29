package com.syntax.class04;

public class Task2TempretureCheck {

	public static void main(String[] args) {
		/*Create variable to store temperature. 
		 * Your program should check if temperature is below 32 then it should print
		 *  “Water will freeze with temperature ”, otherwise “Water will NOT freeze with temperature ”
		 */

		int temperature = 45;
		
		if(temperature <32) {
		
		System.out.println("Water will freeze with temperature");
		}else {
			System.out.println("Water will NOT freeze with temperature");
		}
	}

}
