package com.langfundamental.logic;
import java.util.Scanner;
public class NthPerfect {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter the Nth Perfect Number You Want : ");
		int n = p.nextInt();
		int count =0;
		
		for(int i=1; ;i++) {
			int sum =0;
			for(int j=1;j<=i/2;j++) {
				if(i%j == 0) {
					sum +=j;
				}
				
				
			}
			if(sum == i) {
				count = count +1;
				if(count == n) {
					System.out.println(i +" ");
					break;
				}
			}

		}
		p.close();

	}

}
