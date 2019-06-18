package ru.epam.javaFundamentals.optionalTask3;

import java.time.Month;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Month: ");
		int userInput = scanner.nextInt();
		if (userInput >= 1 && userInput <= 12) {
			System.out.println(Month.of(userInput));
		} else {
			System.out.println("Incorrect value!");
		}
	}
}
