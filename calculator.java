package day3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		Scanner scanner = new Scanner(System.in); // Using Scanner class to get input from
		double num1 = scanner.nextDouble();
		System.out.println(num1);
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		System.out.println(num2);

		System.out.println("Choose ana operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int choice = scanner.nextInt();
		// System.out.println(choice);
		if (choice == 1) {
			System.out.println("Result:" + (num1 + num2));
		} else if (choice == 2) {
			System.out.println("Result:" + (num1 - num2));
		} else if (choice == 3) {
			System.out.println("Result:" + (num1 * num2));
		} else if (choice == 4) {
			if (num2 != 0) {
				System.out.println("Result:" + (num1 / num2));
			} else {
				System.out.println("Error: Division by zero is not allowed");
			}

		} else {
			System.out.println("Invalid Choice");
		}

	}
}