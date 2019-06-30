package ru.epam.javaFundamentals.mainTask;

public enum Ingredient {

	TOMATO_PASTE(1), CHEESE(1), SALAMI(1.5), BACON(1.2), GARLIC(0.3), CORN(0.7), PEPPERONI(1.5), OLIVES(0.5),
	PEPPER(0.6);
	private double price;

	private Ingredient(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
