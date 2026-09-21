package com.langfundamental.logic;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int a1 = n;
		int b1 = n;
		int sum =0;
		int count = String.valueOf(n).length();
		
//		while(n>0 ) {
//			int b = n%10;
//			count +=1;
//			n=n/10;
//		}
		while(b1 > 0) {
			int a = b1%10;
			sum += (int)Math.pow(a,count);
			b1=b1/10;
			
		}
		
		if(sum == a1) {
			System.out.println("Given Number is An Armstrong Number");
		}else {
			System.out.println("Given Number is Not An Armstrong Number");
		}

	}

}
