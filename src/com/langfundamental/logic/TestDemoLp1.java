package com.langfundamental.logic;

import java.util.Scanner;

// perfect number finding
public class TestDemoLp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		// with method and without return type
		// isperfect(n);

		// with method and return type

//		boolean a = isperfect(n);
//		if(a) {
//			System.out.println("Give Number "+n+" Is a perfect number");
//		}else {
//			System.out.println("Given Number "+n+" Is not a perfect number");
//		}

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println("Give Number " + n + " Is a perfect number");
		} else {
			System.out.println("Given Number " + n + " Is not a perfect number");
		}

	}

//-------------------------------------------------------------------------------------------------------------------------------
	// with out return type:

//	static void isperfect(int n ) {
//		int sum =0;
//		for(int i=1;i<=n/2;i++) {
//			if(n%i == 0) {
//				sum += i;
//			}
//		}
//		if(sum == n) {
//			System.out.println("Give Number "+n+" Is a perfect number");
//		}else {
//			System.out.println("Given Number "+n+" Is not a perfect number");
//		}
//	}

//--------------------------------------------------------------------------------------------------------------------------------	
	// with return type:

//	static boolean isperfect(int n) {
//		int sum =0;
//		boolean status = true;
//		for(int i=1;i<= n/2;i++) {
//			if(n%i == 0) {
//				sum +=i;
//			}
//		}
//		if(sum != n) {
//			status = false;
//		}
//		return status;
//	}

}
