package com.syntaxJava11;

public class Car {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color="White";
		String make ="AMG GT";
		String Model ="63S";
		int year =2021;
		int Hp=300;
		
		void moveForward( ) {
			System.out.println(make+ "is moving forwards ....");
			
		}
		void movebacwards() {
			System.out.println(make+" is moving backwards.....");
			
		}
			public static void main(String[] args) {
				
				Car mercedes=new Car();
				
				mercedes.movebacwards();
				
			}
	}


