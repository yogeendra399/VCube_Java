package com.langfundamental.constructor;

//
//1.Create a Java program using Constructor Chaining with the following requirements:
//
//Create an Employee class with the fields:
// id
//name
//salary
//->Create a three-argument constructor that accepts id, name, and salary.
//
//->Create another constructor and use this() constructor chaining to call the three-argument constructor.
//
//->Create an object by passing employee details.
//Create a display() method to print the employee details

public class Chain {

	int id;
	String name;
	double salary;


	Chain(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	Chain(int id,String name){
		this(id,name,0.0);
	}

	Chain(){
		this(0,"unknown");
	}

	void display() {
		System.out.println("***********************************************");
		System.out.println("Employee Details ");
		System.out.println(" ");
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
		System.out.println("************************************************");
	}

	public static void main(String[] args) {

		Chain c = new Chain(31399 , "Varma" , 67000.9);
		c.display();

	}

}
