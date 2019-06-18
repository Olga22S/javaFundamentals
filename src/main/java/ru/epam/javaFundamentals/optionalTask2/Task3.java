package ru.epam.javaFundamentals.optionalTask2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		String userInput = scanner.nextLine();
		for (String i : getValuesMoreAverage(userInput)) {
			System.out.println(i + " size number: " + i.length());
		}
		for (String i : getValuesLessAverage(userInput)) {
			System.out.println(i + " size number: " + i.length());
		}
	}

	private static String[] getValuesMoreAverage(String userInput) {
		return Arrays.asList(userInput.split(" ")).stream().filter(x -> x.length() > getAverageLenght(userInput))
				.toArray(String[]::new);
	}

	private static String[] getValuesLessAverage(String userInput) {
		return Arrays.asList(userInput.split(" ")).stream().filter(x -> x.length() < getAverageLenght(userInput))
				.toArray(String[]::new);
	}

	private static double getAverageLenght(String userInput) {
		return Arrays.asList(userInput.split(" ")).stream().mapToInt(s -> s.length()).average().getAsDouble();

	}
}
