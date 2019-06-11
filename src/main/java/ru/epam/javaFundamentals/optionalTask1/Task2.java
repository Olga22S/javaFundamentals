package ru.epam.javaFundamentals.optionalTask1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type symbols:");
		String symbols = scanner.next();
		System.out.println(new StringBuffer(symbols).reverse().toString());
	}
}
