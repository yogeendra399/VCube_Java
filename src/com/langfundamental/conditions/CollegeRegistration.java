package com.langfundamental.conditions;

import java.util.Scanner;

class Student {

	String name;
	int id;
	String branch;
	String course;
	double fee;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	Student() {
		this("Unknown", 0);
	}

	void registration(String branch, String course, double fee) {
		this.branch = branch;
		this.course = course;
		this.fee = fee;
		System.out.println("\n------------------------------------------");
		System.out.println(" COURSE REGISTRATION SUCCESSFUL");
		System.out.println("------------------------------------------");
		System.out.println("Department : " + branch);
		System.out.println("Course : " + course);
		System.out.println("Course Fee : ₹" + fee);
	}

	void display() {

		if (course == null) {
			System.out.println("No Course Registered Yet !!");
			return;
		}
		double discount = 0;

		if (fee >= 70000) {
			discount = fee * 10 / 100;
		} else if (fee >= 60000) {
			discount = fee * 5 / 100;
		}

		double finalFee = fee - discount;
		System.out.println("\n================================================");
		System.out.println("              STUDENT DETAILS");
		System.out.println("================================================");

		System.out.println("Student Name        : " + name);
		System.out.println("Student ID          : " + id);
		System.out.println("Student Department  : " + branch);
		System.out.println("Student Course      : " + course);

		System.out.println("------------------------------------------------");

		System.out.println("Original Course Fee : ₹" + fee);
		System.out.println("Discount            : ₹" + discount);
		System.out.println("Final Course Fee    : ₹" + finalFee);

		System.out.println("================================================");
	}

	void calculate() {
		if (fee <= 0) {
			System.out.println("\nNo Course Registered Yet!");
			return;
		}
		double discount = 0;
		if (fee >= 70000) {
			discount = fee * 10 / 100;
		} else if (fee >= 60000) {
			discount = fee * 5 / 100;
		}
		double finalFee = fee - discount;
		System.out.println("\n------------------------------------------");
		System.out.println(" FEE DETAILS");
		System.out.println("------------------------------------------");
		System.out.println("Student Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Original Fee : ₹" + fee);
		System.out.println("Discount : ₹" + discount);
		System.out.println("Final Fee : ₹" + finalFee);
		System.out.println("------------------------------------------");
	}
}

public class CollegeRegistration {

	static {
		System.out.println("-------------- Welcome to VCube College Registration -----------------");
		System.out.println("\n");
	}

	{
		System.out.println("--> Go to Menu Page\n");
		System.out.println("In the Below Menu Select Your Option: \n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CollegeRegistration c = new CollegeRegistration();
		System.out.println("Enter the Name of the Student :");
		String name = sc.nextLine();
		System.out.println("Enter Your Student ID:");
		int id = sc.nextInt();
		Student s = new Student(name, id);

		int choice;

		do {
			System.out.println(" ");
			System.out.println("Welcome to Vcube College:\n");
			System.out.println("1.Registration");
			System.out.println("2.View Student Details");
			System.out.println("3.Calculate Course Fee");
			System.out.println("4.Exit");
			System.out.println("\n-----------------------");
			System.out.println(" ");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("---------Select Department ----------");
				System.out.println("1. CSE");
				System.out.println("2. ECE");
				System.out.println("3. EEE");
				System.out.println("4. MECH");

				System.out.println(" ");
				System.out.println("Enter Your Department Choice :");
				int deptchoice = sc.nextInt();

				String dept = "";
				String course = "";
				double fee = 0.0;
				switch (deptchoice) {
				case 1:
					dept = "Computer Science";
					System.out.println("------CSE Course Collection -----");
					System.out.println(" ");
					System.out.println("1.Java");
					System.out.println("2.Python");
					System.out.println("3.Devops");
					System.out.println("4.Testing");

					System.out.println(" ");
					System.out.println("Enter Your Choice :");

					int cse = sc.nextInt();
					switch (cse) {
					case 1:
						System.out.println("JAVA Course Selected In CSE");
						course = "Java";
						fee = 60000;
						break;
					case 2:
						System.out.println("PYTHON Course Selected In CSE");
						course = "Python";
						fee = 60000;
						break;
					case 3:
						System.out.println("Devops Course Selected In CSE");
						course = "Devops";
						fee = 75000;
						break;
					case 4:
						System.out.println("Testing Course Selected In CSE");
						course = "Testing";
						fee = 45000;
						break;
					default:
						System.out.println("Invalid Course Option Selected !!");

					}
					break;
				case 2:
					dept = "Electronics and Communication Engineering";
					System.out.println("----------ECE Course Collection ----------");
					System.out.println("");
					System.out.println("1. VLSI Design");
					System.out.println("2. Embedded Systems & IoT");
					System.out.println("3. PCB Design");
					System.out.println("4. Wireless/RF Communication");

					System.out.println("");
					System.out.println("Enter Your Choice:");
					int ece = sc.nextInt();
					switch (ece) {
					case 1:
						System.out.println("VLSI Design Course Selected In ECE");
						course = "VLSI Design";
						fee = 55000;
						break;
					case 2:
						System.out.println("Embedded Systems & IoT Course Selected In ECE");
						course = "Embedded Systems & IoT";
						fee = 50000;
						break;
					case 3:
						System.out.println("PCB Design Course Selected In ECE");
						course = " PCB Design";
						fee = 60000;
						break;
					case 4:
						System.out.println("Wireless/RF Communication Course Selected In ECE");
						course = "Wireless/RF Communication";
						fee = 65000;
						break;
					default:
						System.out.println("Invalid Course Option Selected !!");
					}
					break;
				case 3:
					dept = "Electrical and Electronics Engineering";
					System.out.println("---------- EEE Course Collection ----------");
					System.out.println("");
					System.out.println("1. Industrial Automation (PLC, SCADA, and DCS)");
					System.out.println("2. Power Systems and Solar Energy Design");
					System.out.println("3. Embedded Systems and IoT");
					System.out.println("4. Robotics and Electric Vehicles (EV) Technology");
					System.out.println(" ");

					System.out.println("Enter Your Choice:");
					int eee = sc.nextInt();
					switch (eee) {
					case 1:
						System.out.println(" Industrial Automation (PLC, SCADA, and DCS) Course Selected In EEE");
						course = " Industrial Automation (PLC, SCADA, and DCS)";
						fee = 60000;
						break;
					case 2:
						System.out.println("Power Systems and Solar Energy Design Course Selected In EEE");
						course = "Power Systems and Solar Energy Design";
						fee = 60000;
						break;
					case 3:
						System.out.println("Embedded Systems and IoT Course Selected In EEE");
						course = "Embedded Systems and IoT";
						fee = 62000;
						break;
					case 4:
						System.out.println("Robotics and Electric Vehicles (EV) Technology Course Selected In EEE");
						course = "Robotics and Electric Vehicles (EV) Technology";
						fee = 65000;
						break;
					default:
						System.out.println("Invalid Course Option Selected !!");

					}
					break;
				case 4:
					dept = "Mechanical engineering";
					System.out.println("------------ MECH Course Collection ----------- ");
					System.out.println(" ");
					System.out.println("1. Mechatronics");
					System.out.println("2. Robotics");
					System.out.println("3. HVAC Systems Design");
					System.out.println("4. Piping Design & Stress Analysis");

					System.out.println("");

					System.out.println("Enter Your Choice: ");
					int mech = sc.nextInt();
					switch (mech) {
					case 1:
						System.out.println("Mechatronics Course Selected In MECH");
						course = "Mechatronics";
						fee = 45000;
						break;
					case 2:
						System.out.println("Robotics Course Selected In MECH");
						course = "Robotics";
						fee = 40000;
						break;
					case 3:
						System.out.println("HVAC Systems Design Course Selected In MECH");
						course = "HVAC Systems Design";
						fee = 42500;
						break;
					case 4:
						System.out.println("Piping Design & Stress Analysis Course Selected In MECH");
						course = "Piping Design & Stress Analysis";
						fee = 50000;
						break;
					default:
						System.out.println("Invalid Course Option Selected !!");
					}
					break;
				default:
					System.out.println("Invalid Department Option Selected !!");
				}
				if (fee > 0) {
					s.registration(dept, course, fee);
				}
				break;

			case 2:
				s.display();
				break;
			case 3:
				s.calculate();
				break;
			case 4:
				System.out.println("\nThank You For Using VCube College Registration!\n");
				break;
			default:
				System.out.println("Invalid Menu Choice!\n");

			}

		} while (choice != 4);

		sc.close();

	}

}
