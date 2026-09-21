package com.langfundamental.conditions;
// 3.Write a Java program to find the sum of all numbers from 1 to N that are divisible by both 3 and 5 using a for loop.
public class TestDemoLoop3 {

	public static void main(String[] args) {
		for(int i=1;i<501;i++) {
			if((i%3) == 0 && (i%5 )==0){
				System.out.print(i+" ");
			}
		}

	}

}
