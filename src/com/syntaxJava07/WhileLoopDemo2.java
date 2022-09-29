package com.syntaxJava07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		//print all numbers from 1 to 10 
		
		
		
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
				}
		System.out.println("============================");
		int a=10;
		while(a<=25) {
			
			System.out.print(a+" ");
			a++;
		}
		System.out.println("============================");
		
		int b=10;
		while(b>=1) {
			//b--;
		System.out.print(b+" ");
		b--;
		}
		System.out.println("============================");
		//print all numbers from 50 to 20
		
		int c=50;
		while(c>=20) {
		
	System.out.print(c+" ");
	c--;
	}
		System.out.println("=====================");
		
		//print all even numbers from 1 to 20 
		
		int d=2;
		while(d<=20) {
			System.out.print(d+ " ");
			d+=2;
			
		}
			while(d<=20) {
	            if(d %2 ==0) {
	                System.out.print(d+" ");
	            }
	    System.out.println("Another Way");
			
			int i =2;
			
	    while (i<=20) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
				i++;
				
				}
	    }
			}
	
}
