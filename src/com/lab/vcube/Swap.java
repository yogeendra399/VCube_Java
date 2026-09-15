package com.lab.vcube;

public class Swap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("A value before swap :  " + a);
		System.out.println("B value before swap :  " + b);
		System.out.println("-------------------------------");

		// temparary variable:

		int c = a;
		a=b;
		b=c;
		System.out.println("A value after swap :  " + a);
		System.out.println("B value after swap :  " + b);

	}

}
