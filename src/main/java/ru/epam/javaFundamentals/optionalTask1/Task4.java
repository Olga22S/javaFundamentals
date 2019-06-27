package ru.epam.javaFundamentals.optionalTask1;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter second number: ");
		int b = scanner.nextInt();
		System.out.println("a+b = " + (a + b) + "\na*b = " + a * b);
	}
}
