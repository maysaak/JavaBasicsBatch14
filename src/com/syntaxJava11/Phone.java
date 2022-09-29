package com.syntaxJava11;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	
	void call() {
		System.out.println("Calling....");
	}
	void takePicture() {
		System.out.println("Taking Pictures");
	}
	public static void main(String[] args) {
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 14 Promax";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("Make "+iphone.make+" Model "+iphone.model);
		iphone.takePicture();
		System.out.println("___________________________");
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="God knows";
		samsung.color="Ugly";
		samsung.storage=256;
		samsung.size=6.7;
		samsung.cheap=false;
		
		System.out.println(iphone.make);
		System.out.println(samsung.make);
		System.out.println(samsung.model);
		samsung.takePicture();
		
	}
}
