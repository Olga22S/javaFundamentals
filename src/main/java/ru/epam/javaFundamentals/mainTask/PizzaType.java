package ru.epam.javaFundamentals.mainTask;

public enum PizzaType {

	CALZONE(1.5), ORDINARY(1.0);
	private double price;

	private PizzaType(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
