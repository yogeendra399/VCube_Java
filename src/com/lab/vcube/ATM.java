package com.lab.vcube;

public class ATM {

	static  String bankname = "SBI";
	long accountnumber;
	double balance ;

	void deposit(double amount) {
		balance += amount;
		System.out.println( amount + " Amount Deposited");
	}
	void withdrawl(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance In Account");
		}else {
			balance -= amount;
			System.out.println("Amount withdrawal Sucessful..!!");
		}
		checkbalance();
	}
	void checkbalance() {
		System.out.println("Current balance: " + balance);
	}

	public static void main(String[] args) {

		ATM a1 = new ATM();
		System.out.println("Bank name: " +bankname);
		a1.accountnumber = 123437619;
		a1.balance = 15000.00;
		System.out.println("Account Number:" +a1.accountnumber);
		a1.deposit(500000.00);
		a1.withdrawl(400000.00);
		System.out.println();

		ATM a2 = new ATM();

		a2.accountnumber = 43215678;
		a2.balance = 65000.0;
		bankname = "Canara";
		System.out.println("Bank name: " +bankname);
		System.out.println("Account number:" +a2.accountnumber);
		a2.deposit(500000);
		a2.withdrawl(85000);





	}

}
