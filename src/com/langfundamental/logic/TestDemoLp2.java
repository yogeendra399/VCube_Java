package com.langfundamental.logic;
import java.util.Scanner;

// WAP to print the factorial's of  a given number
public class TestDemoLp2 {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           	System.out.println("Enter the Number : ");
           	int n = sc.nextInt();
           	
           	for(int i=1;i<=n/2;i++) {
           		if(n%i == 0) {
           			System.out.print(i+" ");
           		}
           	}
	}

}
