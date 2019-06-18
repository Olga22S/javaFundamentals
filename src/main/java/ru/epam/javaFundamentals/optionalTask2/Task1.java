package ru.epam.javaFundamentals.optionalTask2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		String userInput = scanner.nextLine();
		System.out.println("The longest number: ");
		System.out.println(getLongestAndItSize(userInput));
		System.out.println("The shortest number: ");
		System.out.println(getShortestAndItSize(userInput));
	}

	private static String getLongestAndItSize(String userInput) {
		return Arrays.stream(userInput.split(" ")).max(Comparator.comparingInt(String::length))
				.map(s -> s + " - size " + s.length()).get();
	}

	private static String getShortestAndItSize(String userInput) {
		return Arrays.stream(userInput.split(" ")).min(Comparator.comparingInt(String::length))
				.map(s -> s + " - size " + s.length()).get();
	}
}
