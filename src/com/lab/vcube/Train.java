package com.lab.vcube;

import java.util.Scanner;

public class Train {

	int tarin_no;
	int name;
	String source;
	String destination;
	double ticketprice;
	int totalseats;
	int avaliableseats;


	void traindetails() {

	}


	void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Train t = new Train();
		System.out.println("Enter the Source(Strat Point)");
		t.source = sc.next();
		System.out.println("Enter the Destination:");
		t.destination = sc.next();
		
		sc.close();


	}

}
