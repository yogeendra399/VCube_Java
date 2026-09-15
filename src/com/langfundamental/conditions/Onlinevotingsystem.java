package com.langfundamental.conditions;
import java.util.Scanner;

public class Onlinevotingsystem {

    public static void main(String[] args) {
        System.out.println("Main Method Strated !!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Not Eligible !!");
        } else {
            System.out.println("You are Eligible !!");
            System.out.println("Enter your Gender 'M' or 'F'");
            char str = sc.next().toUpperCase().charAt(0);

            if (str != 'M' && str != 'F') {
                System.out.println("Invalid Gender! Not Eligible");
            } else {
                System.out.println("Enter Your voter id : ");
                int vote = sc.nextInt();

                int n;
                do {
                    System.out.println("\n-----------Voting Candidates----------");
                    System.out.println(" TDP        : option No 1");
                    System.out.println(" YSRCP      : option No 2");
                    System.out.println(" Congress   : option No 3");
                    System.out.println(" DMK        : option No 4");
                    System.out.println(" KTR        : option No 5");
                    System.out.println(" NOTA       : option No 6");

                    System.out.println("Enter Your choice by pressing the option No !!");
                    n = sc.nextInt();

                    switch (n) {
                        case 1:
                            System.out.println("You Voted for TDP");
                            System.out.println("Your Voter ID : " + vote);
                            break;
                        case 2:
                            System.out.println("You Voted for YSRCP");
                            System.out.println("Your Voter ID : " + vote);
                            break;
                        case 3:
                            System.out.println("You Voted for Congress");
                            System.out.println("Your Voter ID : " + vote);
                            break;
                        case 4:
                            System.out.println("You Voted for DMK");
                            System.out.println("Your Voter ID : " + vote);
                            break;
                        case 5:
                            System.out.println("You Voted for KTR");
                            System.out.println("Your Voter ID : " + vote);
                            break;
                        case 6:
                            System.out.println("You Voted for NOTA");
                            System.out.println("Your Voter ID : " + vote);
                            break;
                        default:
                            System.out.println("You Entered the Wrong No");
                            System.out.println("You Re-Entering the Vote Once Again");
                            System.out.println("Choose wisely");
                    }
                    System.out.println("Thank you for voting!!");

                } while (n < 1 || n > 6);
            }
        }
        System.out.println("Main Method Ended !!");
        sc.close();
    }
}