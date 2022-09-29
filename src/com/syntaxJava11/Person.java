package com.syntaxJava11;

public class Person {
	String name;
	int age;
	double weight;
	boolean isFunny;
	double height;
	boolean loosingHair;
	
	void study() {
		if(name.equals("Anna")) {
			System.out.println("I study hard");
		}else if(name.equals("Roman")) {
		System.out.println("I will keep on deleting messages and bother everyone");
		
		}else {
			System.out.println("I try to study but things do not make any sense");
	}
	

}

	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="Anna";
		person1.study();
		Person person2 =new Person();
		person2.name="Julie";
		person2.study();
		Person person3=new Person();
		person3.name="Roman";
		person3.study();
	}
	}