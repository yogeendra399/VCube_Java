package com.langfundamental.constructor;

import java.util.Scanner;

//1.Write a Java program to take Variables as EmployeeName , Salary, and CompanyName
//Pass the values while creating an object and assign the local values to class level data members
//Take the display method to display each object data

public class Argument {

	String name;
	double salary;
	String company;

	Argument(String name,double salary,String company){
		this.name = name;
		this.salary = salary;
		this.company = company;
	}

	void dispaly() {
		System.out.println("------Employee Details ---------");
		System.out.println("Employee Name : " + name );
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee working Company : " + company);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Employee :");
		String name = sc.next();
		System.out.println("Employee Salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter the Employee Working Company :");
		String company = sc.next();
		Argument a = new Argument(name,salary,company);
		a.dispaly();
		sc.close();


	}

}
