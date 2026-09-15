package com.langfundamental.constructor;

public class Customer {

	int cid;
	String name;

	Customer(){
		cid = 110;
		name = "Enter your name";
	}

	Customer(int cid,String name){
		System.out.println("Parameterized constructor called !!");
		// i pass the parameters but didn't assign to the object variables
		this.cid = cid;
		this.name = name;
	}
//	static{
//		System.out.println("Static block called !!");
//	}
//
//
//	{
//		System.out.println("Instance block called !!");
//		System.out.println("Hello world");
//	}
	{
		System.out.println("Customer id: " + cid);
		System.out.println("Customer Name: " + name);
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Customer c = new Customer();

		System.out.println("CID: "+ c.cid);
		System.out.println("NAME: " + c.name);
		Customer c1 = new Customer(101,"Varma");

		System.out.println("CID: " +c1.cid);
		System.out.println("Nmae:  "+ c1.name);

	}

}
