package com.lab.vcube;

import java.util.Scanner;

public class LoanManagement {

	String customername;
	double loanamount;
	double interestrate;
	int loantenure;

	double calculateinterest(double amount,double interest,int time) {
		double totalinterest = (amount*interest*time)/100;
		return totalinterest;
	}
	double totalamount(double interest) {
		double totalamount =  loanamount + interest;
		return totalamount;
	}
	double monthlyEMI(double amount, int time) {
		double EMI = amount / (time*12);
		return EMI;
	}

	void display(double amount, double interest,double emi) {

		System.out.println("Customer Name   : " + customername);
        System.out.println("Loan Amount     : " + loanamount);
        System.out.println("Interest Rate   : " + interestrate + "%");
        System.out.println("Loan Tenure     : " + loantenure + " Years");
        System.out.println("Interest        : " + interest);
        System.out.println("Total Amount    : " + amount);
        System.out.println("Monthly EMI     : " + emi);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LoanManagement l1 = new LoanManagement();
		System.out.println("Enter Your name: ");
		l1.customername = sc.next();
		sc.nextLine();
		System.out.println("Enter the LoanAmount you want to Take: ");
		l1.loanamount = sc.nextDouble();
		System.out.println("Our loan interrest is 8.7%");
		l1.interestrate = 8.7;
		System.out.println("Put your Loan Tenure(Time): ");
		l1.loantenure = sc.nextInt();

		double interest1 = l1.calculateinterest(l1.loanamount,l1.interestrate,l1.loantenure);
		double amount = l1.totalamount(interest1);
		double emi = l1.monthlyEMI(amount, l1.loantenure);


		System.out.println("----------------LOAN AMOUNT FROM SBI --------------------");
		l1.display(amount, interest1, emi);
		System.out.println();
		System.out.println();

		LoanManagement l2 = new LoanManagement();
		System.out.println("Enter Your name: ");
		l2.customername = sc.next();
		sc.nextLine();
		System.out.println("Enter the LoanAmount you want to Take: ");
		l2.loanamount = sc.nextDouble();
		System.out.println("Our loan interrest is 5.7%");
		l2.interestrate = 5.7;
		System.out.println("Put your Loan Tenure(Time): ");
		l2.loantenure = sc.nextInt();
		double interest2 = l2.calculateinterest(l2.loanamount,l2.interestrate,l2.loantenure);
		double amount2 = l2.totalamount(interest2);
		double emi1 = l2.monthlyEMI(amount2, l2.loantenure);


		System.out.println("----------------LOAN AMOUNT FROM CANARA --------------------");
		l1.display(amount2, interest2, emi1);
		
		sc.close();



	}

}
