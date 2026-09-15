package com.langfundamental.constructor;

class copy1{
	String name;
	int id;
	String clgname;
	double fee;
	
	copy1(String name,int id,String clgname,double fee){
		this.name=name;
		this.id=id;
		this.clgname=clgname;
		this.fee=fee;
	}
	
	copy1(copy1 c){
		this.name=c.name;
		this.id=c.id;
		this.clgname=c.clgname;
		this.fee = c.fee;
	}
	
	void display() {
		 System.out.println("Product Name : " + name);
	        System.out.println("Product ID   : " + id);
			 System.out.println("Product Name : " + clgname);
	        System.out.println("Price        : " + fee);
	}
	
}

public class Product {

	public static void main(String[] args) {
		
		copy1 c1 = new copy1("varma",12,"klu",50000.0);
		
		copy1 c2 = new copy1(c1);
		
		c1.display();
		 System.out.println(" ");
		 System.out.println("copy constructor ");
		 c2.display();


		

	}

}
