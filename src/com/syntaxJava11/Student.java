package com.syntaxJava11;

public class Student {

	
		
		String name;
		String id;
		char gender;
		int age;
		double weight;
		
		void study() {
			System.out.println("Student is studying");
		}
		void learn() {
			System.out.println("Student is learning new programs");
		}
        void eat() {
        	System.out.println("Student is eating pizzs");
	}
        public static void main(String[] args) {
        Student ali=new Student();
        ali.name="Larisa";
        ali.id="457";
        ali.gender='M';
        ali.age=29;
        ali.weight=105;
        System.out.println(ali.name);
        System.out.println(ali.age);
        
        ali.study();
        ali.eat();
        System.out.println("*******************");
        Student student2=new Student();
        student2.name="Ella";
        student2.age=16;
        student2.gender='F';
        System.out.println(student2.name);
        student2.eat();
        
}
}