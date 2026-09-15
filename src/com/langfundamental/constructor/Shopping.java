package com.langfundamental.constructor;

//2. Online Shopping System
//
//Create a Java program for an Online Shopping System.
//
//Parent class Customer:
//
//customerName
//email
//phoneNumber
//
//Child class Order:
//
//productName
//quantity
//price
//discount
//
//Requirements:
//
//Use constructor chaining with this().
//Use super() to call the parent constructor.
//Calculate subtotal.
//Apply discount.
//Add 18% GST after discount.
//Display the final bill.

class Customer1{
	String name;
	String email;
	long  number;

	Customer1(String name,String email,long number){
		this.name = name;
		this.email=email;
		this.number = number;
	}
	Customer1(){
		this("unknown","unknown",0);
	}
}

class Order extends Customer1{
	String pname;
	double quantity;
	double price;
	double discount;
	double total;
	double gst;

	Order(String name,String email,long number,String pname,double quantity,double price,double discount){
		super(name,email,number);
		this.pname=pname;
		this.quantity=quantity;
		this.price = price;
		this.discount = discount;

	}
	void calcualte() {
		double subtotal = quantity * price;
		double discountAmount = subtotal * discount / 100;
		total = subtotal - discountAmount;
		gst = total * 18 / 100;


	}
	void dispaly() {
		System.out.println("----------Shopping Bill --------------");
		System.out.println( " ");

		System.out.println("----------Customer Details ------------");
		System.out.println("Customer Name           : " + name);
		System.out.println("Customer email          : " + email);
		System.out.println("Customer Number         : " + number);
		System.out.println(" ");

		System.out.println("----------Product Details -------------");
		System.out.println("Product Name            : " + pname);
		System.out.println("Product Quantity        : " + quantity);
		System.out.println("Price of the Product    : " + price);
		System.out.println("Discount on the product : " + discount);
		System.out.println("Bill with discount      : " + total);
		System.out.println(" ");
		System.out.println("GST 18% Charged on the Product ");
		System.out.println(" ");
		System.out.println("Gst Charged             : " + gst);
		System.out.println("Total Bill              : " + (gst+total));
		System.out.println("----------------------------------------");
	}
}

public class Shopping {

	public static void main(String[] args) {
		Order o = new Order("Yogeendra", "yogi7761@gmail.com", 9876543210L, "Laptop", 2, 50000, 10);
		o.calcualte();
		o.dispaly();


	}

}
