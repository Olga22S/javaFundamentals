package ru.epam.javaFundamentals.mainTask;

public enum Ingredient {

	TomatoPaste(1), Cheese(1), Salami(1.5), Bacon(1.2), Garlic(0.3), Corn(0.7), Pepperoni(1.5), Olives(0.5),
	Pepper(0.6);
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
