package com.langfundamental.constructor;

import java.util.Scanner;

//1.Create a Java program to calculate a customer’s Mobile Bill using constructor chaining.
//->Create multiple constructors and use "this()" to perform constructor chaining.

//->The program should calculate:
//- Mobile cost = Price × Quantity
//- Final bill = Mobile cost + Delivery charge

//->Ask the user for:
//Mobile model, Quantity, Price, and Delivery charge.

//Output
//Display mobile model, price, quantity, mobile cost, delivery charge, and final bill.
//Note: Use constructor chaining only.
public class Mobile {

	String model;
	int quantity;
	double price;
	double deliverycharge;
	double cost;
	double bill;
	double gst; //8.7

	Mobile(String model, int quantity, double price, double delivercharge){
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.deliverycharge = deliverycharge;


		cost = price * quantity;
		gst = (cost * 8.7)/100;
		cost +=gst;
		bill = cost + deliverycharge;



	}
	Mobile(String model,int quantity ,double price){
		this(model,quantity,price, 0.0);
	}
	Mobile(String model , int quantity){
		this(model,quantity,0.0);
	}

	Mobile(){
		this("unknown",0);
	}

	void display() {
		System.out.println("------------Mobile Bill -------------");
		System.out.println("Mobile Model : " + model);
		System.out.println("Price of the Mobile : " + price);
		System.out.println("Mobile Quantity : " + quantity);
		System.out.println("GST on this Mobile :" + gst);
		System.out.println("After the gst The cost of the Mobile IS :");
		System.out.println("Cost of the Mobile : " + cost);
		System.out.println("Delivey Charge : " + deliverycharge);
		System.out.println("FINAL BILL : " + bill);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Model of the Mobile : ");
		String model = sc.next();
		System.out.println("Mobile Quantity : ");
		int quantity = sc.nextInt();
		System.out.println("Price of the Mobile : ");
		double price = sc.nextDouble();
		System.out.println("Delivery Charges : ");
		double charge = sc.nextDouble();

		Mobile m = new Mobile(
				model,
				quantity,
				price,
				charge);

		m.display();

		sc.close();

	}

}
