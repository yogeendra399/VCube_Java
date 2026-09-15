package com.langfundamental.constructor;

public class Employee {

	//No argument constructor created.  Also it was called when the object is created.
	// this constructor was called by jvm when the object is created
	// NOTE:  without parameter passing in the object.
	Employee(){
		System.out.println("No argument constructor was called");
		System.out.println("*****************************************");
		System.out.println(" ");
		}

	// when i pass the values in the object
	// we have to create the parameterized constructor to with out that we  can get the error.
	Employee(String name){
		System.out.println("One argument constructor was called !!");
		System.out.println("Name of the employee " + name);
		System.out.println("*************************************************");
	}

	Employee(String name , int id, String company){
		System.out.println("3-arg Constructor was called !!!");
		System.out.println("Name of the Employee : " + name);
		System.out.println("ID of the Employee : " + id);
		System.out.println("Name of the Company : " + company);
		System.out.println("******************************************");
	}


	public static void main(String[] args) {

		Employee e = new Employee(); // --> Employee object created and a default constructor was
		                              //    created.

		Employee e1 = new Employee("Varma");
		Employee e2 = new Employee("Varma" , 31399 ,"Amazon");
		
		

	}

}
