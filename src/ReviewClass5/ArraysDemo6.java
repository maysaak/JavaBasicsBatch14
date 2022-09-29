package ReviewClass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type =new Scanner(System.in);
		System.out.println("Please enter the number of dresses do you want to buy?");
		int size=type.nextInt();
		
		double[] prices=new double[size];
		
		for(int i=0; i<size; i++) {
		System.out.println("Please enter the price of no "+(i+1));	
		prices[i]=type.nextDouble();
		
		}
		System.out.println(Arrays.toString(prices));
		
		//limitations for enhanced for loop
		//we can only go in one direction 
		//we cant skip the elements 
		//we cant use enhance for loop to update the values in an array
		//we can only use it to access the elements 
		
		double sum=0;
		for(double price:prices) {
			sum+=price;//shorter for sum=sum+price
		}
		System.out.println("Total for all the dress = "+sum);
			
		}
	}


