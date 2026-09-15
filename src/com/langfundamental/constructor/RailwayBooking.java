package com.langfundamental.constructor;

import java.util.Scanner;

//Java
//1.Create a Java program for a Railway Ticket Booking System using this() and super().
//Requirements
//Create a parent class Railway with:
//passengerName, age, source, destination
//Create a child class Ticket with:
//numberOfTickets, price = 500
//Use this() for constructor chaining and super() to call the parent constructor.
//Create a method bookTicket() to calculate the ticket amount and display booking success.
//Create displayBookingDetails() to display all passenger and ticket details.


class Railway{

	String name;
	int age;
	String source;
	String destination;

	Railway(String name, int age, String source,String destination){
		  this.name = name;
		  this.age=age;
		  this.source = source;
		  this.destination = destination;
	}

	Railway(){
		this("unknown",0,"unknown","unknown");
	}
}

class Ticket extends Railway{
	int tickets;
	double price = 500;
	double amount;

	Ticket(String name,int age,String source,String destination, int tickets){
		super(name,age,source,destination);
		this.tickets = tickets;

	}
	Ticket(){
		this("unknown",0,"unknown","unknown",0);
	}

	void bookTicket() {
	    amount = price * tickets;
	    System.out.println("Ticket is Booked!!");
	    System.out.println("Thank You");

	}
	void dispaly() {
		System.out.println("------------Booking Details -----------");
		System.out.println("Passenger Name     : " + name);
		System.out.println("Passenger Age      : " + age);
		System.out.println("Source             : " + source);
		System.out.println("Destination        : " + destination);
		System.out.println("Ticket Price       : " + price);
		System.out.println("Number of Tickets  : " + tickets);
		System.out.println("Total Tickets Price: " + amount);
	}
}


public class RailwayBooking {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Passenger Name :");
		String name = sc.nextLine();
		System.out.println("Enter the Age of passenger : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Source of the Train : ");
		String source = sc.nextLine();
		System.out.println("Enter the Destination : ");
		String destination = sc.nextLine();
		System.out.println("Enter the Number of Tickets Booking : ");
		int tickets = sc.nextInt();

		Ticket t = new Ticket(name,age,source,destination,tickets);
		t.bookTicket();
		t.dispaly();
		sc.close();

	}

}
