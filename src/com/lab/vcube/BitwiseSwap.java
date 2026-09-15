package com.lab.vcube;

public class BitwiseSwap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("A value before swap :  " + a);
		System.out.println("B value before swap :  " + b);

		// Bitwise Swap

		a = a ^ b; // a+b = 30
		System.out.println("A value after swap :  " + a);

		b = a ^ b; // a- b = 10
		System.out.println("B value after swap :  " + b);

		a = a^b; // a- b = 20
		System.out.println("A value after swap :  " + a);

	}

}
