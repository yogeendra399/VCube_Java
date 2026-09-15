package com.langfundamental.constructor;

import java.util.Scanner;

public class Movie {
	String movie;
	int seats;
	double time;
	double price;
	String theator;
	String location;

	Movie(String movie,int seats,double time,String theator,String location,double price){
		this.movie = movie;
		this.seats= seats;
		this.time = time;
		this.theator = theator;
		this.location = location;
		this.price = price;
	}

	void display() {

		double gst = (seats*price) * 3.7/100;
		double total_cost = (seats * price) + gst;
		System.out.println("-------Movie Ticket----------");
		System.out.println("Movie Name    : " + movie);
		System.out.println("Seats Booked  : " + seats);
		System.out.println("Movie Timing  : " + time);
		System.out.println("Movie Theator : " + theator);
		System.out.println("Movie Theator : " + location);
		System.out.println("GST           : " + gst);
		System.out.println("Price of Movie: " + price);
		System.out.println("Total BILL    : " + total_cost);


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Movie Name : ");
		String movie = sc.nextLine();
		System.out.println("How many Seats Booked : ");
		int seat = sc.nextInt();
		System.out.println("Movie Timing : ");
		double time = sc.nextDouble();
		System.out.println("Movie Theator Name : ");
		String theator = sc.nextLine();
		System.out.println("Movie Location : ");
		String loc = sc.next();
		System.out.println("Enter the price of the ticket : ");
		double price = sc.nextDouble();
		Movie m = new Movie(movie,seat,time,theator,loc,price);

		m.display();
		sc.close();


	}

}
