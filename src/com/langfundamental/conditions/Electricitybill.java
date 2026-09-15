package com.langfundamental.conditions;
import java.util.Scanner;
public class Electricitybill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Government Electricity Consumer Department !!");
		System.out.println(" ");
		System.out.println("Enter the connection Type: ");
		System.out.println("Choose the option A or B");
		System.out.println("----------------------------");
		System.out.println(" A) Domestic : ");
		System.out.println(" B) Commerical : ");
		System.out.println(" ");
		
		String type = sc.next().toUpperCase();
		
		System.out.println("Enter the No. of Units Consumed :");
		int units = sc.nextInt();
		
		String connection = " ";
		double bill=0 ;
		double rate=0;
		boolean isvalid;
		
		do {
			isvalid = true;
			switch(type) {
			case "A":
				connection = "Domestic";
				if(units <= 100) {
					rate = 2;
				}else if(units <= 300) {
					rate = 3;
				}else {
					rate = 4;
				}
				break;
			case "B":
				connection = "Commerical";
				if(units <= 100) {
					rate = 5;
				}else if(units <= 300) {
					rate = 7;
				}else {
					rate = 9;
				}
				break;
			default:
				System.out.println("In Correct Option Choosed !!");
				isvalid = false;
			}
		}while(!isvalid); 
		
		bill = units* rate;
		
		System.out.println("-----------Electricity Bill --------------");
		System.out.println("Consumer Connection : " + connection);
		System.out.println("No. Of units        : " + units);
		System.out.println("Rate on Units       : " + rate);
		System.out.println("Total Bill          : " + bill);
		
		sc.close();
		
	}

}
