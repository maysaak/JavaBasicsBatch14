package com.syntaxJava11;

public class Dog {
    //State-Description of the object
	//Attributes/properties/files - all represent the state of the object 
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	void bark() {
		System.out.println("Dog is barking......");
	}
	void sleep() {
		System.out.println("Dog is sleeping .....");
	}
   public static void main(String[] args) {
	   //creating objects from a class
	Dog dog1=new Dog();//new Dog(); It creates an object of class dog 
	//calling a behaviour of an object 
	dog1.bark();
	dog1.sleep();
	

}
}
