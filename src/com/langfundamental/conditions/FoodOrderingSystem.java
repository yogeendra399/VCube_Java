package com.langfundamental.conditions;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		String itemName = "";
		int price = 0;
		int quantity = 0;
		int totalBill = 0;
		boolean isValid;

		do {
			isValid = true;

			System.out.println("\n------ Food Menu ------");
			System.out.println("1 -> Pizza   - Rs.200");
			System.out.println("2 -> Burger  - Rs.120");
			System.out.println("3 -> Biryani - Rs.180");
			System.out.println("4 -> Noodles - Rs.100");
			System.out.println("-----------------------");

			System.out.print("Select an item (1-4): ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				itemName = "Pizza";
				price = 200;
				System.out.print("Enter quantity for Pizza: ");
				quantity = sc.nextInt();
				totalBill = price * quantity;
				break;

			case 2:
				itemName = "Burger";
				price = 120;
				System.out.print("Enter quantity for Burger: ");
				quantity = sc.nextInt();
				totalBill = price * quantity;
				break;

			case 3:
				itemName = "Biryani";
				price = 180;
				System.out.print("Enter quantity for Biryani: ");
				quantity = sc.nextInt();
				totalBill = price * quantity;
				break;

			case 4:
				itemName = "Noodles";
				price = 100;
				System.out.print("Enter quantity for Noodles: ");
				quantity = sc.nextInt();
				totalBill = price * quantity;
				break;

			default:
				System.out.println("Invalid choice! Please choose 1 to 4 only. Try again.");
				isValid = false;
				break;
			}

		} while (!isValid);

		System.out.println("\n------ Bill ------");
		System.out.println("Item       : " + itemName);
		System.out.println("Price      : Rs." + price);
		System.out.println("Quantity   : " + quantity);
		System.out.println("Total Bill : Rs." + totalBill);

		sc.close();
	}
}