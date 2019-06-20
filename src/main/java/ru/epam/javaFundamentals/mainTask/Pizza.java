package ru.epam.javaFundamentals.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private String name;
	private List<Ingredient> ingredients;
	private PizzaType pizzaType;
	private int quantity;
	private final int orderNumber;
	private int clientNumber;

	public Pizza(int orderNumber, int clientNumber, String name, PizzaType pizzaType, int quantity) {
		this.name = name;
		this.pizzaType = pizzaType;
		this.quantity = quantity;
		this.orderNumber = orderNumber;
		this.clientNumber = clientNumber;
		ingredients = new ArrayList<>();
	}

	public void addIngredient(Ingredient ingredient) {
		if (ingredients.size() == 7) {
			System.out.println("Pizza is full!");
		} else if (ingredients.contains(ingredient)) {
			System.out.println("This ingredient was added! Check your order!");
		} else {
			ingredients.add(ingredient);
		}
	}

	public double getPizzaPrice() {
		return ingredients.stream().mapToDouble(i -> i.getPrice()).sum() + pizzaType.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public PizzaType getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + orderNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pizza)) {
			return false;
		}
		Pizza other = (Pizza) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (orderNumber != other.orderNumber) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return orderNumber + " : " + clientNumber + " : " + name + " : " + quantity;
	}
}
