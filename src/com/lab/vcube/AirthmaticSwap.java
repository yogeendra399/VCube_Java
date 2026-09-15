package com.lab.vcube;

public class AirthmaticSwap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("A value before swap :  " + a);
		System.out.println("B value before swap :  " + b);
		System.out.println("------------------------------");

		// Airthmatic operation

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("A value after swap :  " + a);
		System.out.println("B value after swap :  " + b);

	}

}
