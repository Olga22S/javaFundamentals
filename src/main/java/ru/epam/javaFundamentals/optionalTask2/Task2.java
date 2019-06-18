package ru.epam.javaFundamentals.optionalTask2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		String userInput = scanner.nextLine();
		System.out.println(String.join(" ", getAscendingOrder(userInput)));
		System.out.println(String.join(" ", getDescendingOrder(userInput)));
	}

	private static String[] getAscendingOrder(String userInput) {
		String[] userInputAsArray = userInput.split(" ");
		Arrays.sort(userInputAsArray, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		return userInputAsArray;
	}

	private static String[] getDescendingOrder(String userInput) {
		String[] userInputAsArray = userInput.split(" ");
		Arrays.sort(userInputAsArray, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		return userInputAsArray;
	}
}
