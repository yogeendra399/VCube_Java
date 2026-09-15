package com.langfundamental.constructor;

import java.util.Scanner;

//Java
//1.Create a Java program to calculate a customer’s Hotel Bill using constructor chaining.
//Create multiple constructors and use "this()" to perform constructor chaining.
//The program should calculate:

//- Room cost = Room Price × Number of Days
//- Final bill = Room cost + Food charges

//Ask the user for:
//Room type, Number of days, Room price, and Food charges.

//Output
//Display room type, room price, number of days, room cost, food charges, and final bill.
//Enter Room Type: Deluxe
//Enter Number of Days: 3
//Enter Room Price: 2500
//Enter Food Charges: 1200
//
//----- Hotel Bill -----
//Room Type      : Deluxe
//Room Price     : 2500.0
//Number of Days : 3
//Room Cost      : 7500.0
//Food Charges   : 1200.0
//Final Bill     : 8700.0

public class Hotel {

	String type;
	double price;
	int days;
	double charge;
	double cost;
	double bill;

	Hotel(String type,double price,int days,double charge){
		this.type = type;
		this.price = price;
		this.days = days;
		this.charge = charge;

		 cost = price * days;
		 bill = cost + charge;
	}
	Hotel(String type, double price, int days){
		this(type,price,days,0.0);
	}
	Hotel(String type, double price){
		this(type,price,0);
	}
	Hotel(){
		this("unknown",0.0);
	}

	void display() {
		System.out.println("---------Hotel Bill ---------");
		System.out.println("Room Type       : " + type);
		System.out.println("Room Price      : " + price);
		System.out.println("Number of Days  : " + days);
		System.out.println("Room cost       : " + cost);
		System.out.println("Food Charges    : " + charge);
		System.out.println("Final Bill      : " + bill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the room Type :");
		String type=sc.next();
		System.out.println("Enter the number of Days :");
		int days = sc.nextInt();
		System.out.println("Enter the room Price :");
		double price = sc.nextDouble();
		System.out.println("Enter the Food Charges :");
		double charge = sc.nextDouble();
		Hotel h = new Hotel(type,price,days,charge);

		h.display();
		sc.close();


	}

}
