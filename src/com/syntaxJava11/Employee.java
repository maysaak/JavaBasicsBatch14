package com.syntaxJava11;

public class Employee {
	String name;
	String id;
	String depratmnet;
	double salary;
	String shift;
	
	void work() {
		System.out.println(name+" is working on shift "+shift);
	
	}
	
	void takeLeaves() {
		System.out.println(name+"is going on leaves ");
	}
public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.name="Alina";
	emp1.id="87878";
	emp1.depratmnet="IT";
	emp1.salary=200000;
	emp1.shift="Evening";
	
	emp1.work();
	
	Employee emp2=new Employee();
	emp2.name="Sasha";
	emp2.id="74854";
	emp2.depratmnet="IT";
	emp2.salary=454500;
	emp2.shift="Morning";
	emp2.work();
	
	Employee emp3=new Employee();
	emp3.name="Maysa";
	emp3.id="191919";
	emp3.depratmnet="HR";
	emp3.salary=10000000;
	emp3.shift="Day time";
	emp3.work();
	
	
}
}
