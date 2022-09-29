package com.syntaxJava10;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array integer values. 
		 * After the array is created, fill the array with numbers ask the number
		 * from the user from console with the help of the scanner sum of all stored elemtns in that array 
		 */
		
		Scanner type=new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size=type.nextInt();
		int[] arr=new int[size];
		
		
		for(int i=0; i<size;i++) {
			System.out.println("please enter an int number");
			arr[i]=type.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int num:arr) {
			sum+=num;
			
		}
		
		System.out.println("Sum of all the numbers from the array is "+sum);
		}
		
	}


