package ru.epam.javaFundamentals.mainTask;

import java.util.Arrays;

public class Pizza {

	private String name;
	private Ingredient[] ingredients;
	private PizzaType pizzaType;
	private int quantity;

	public Pizza(String name, PizzaType pizzaType, int quantity) {
		this.name = name;
		this.pizzaType = pizzaType;
		this.quantity = quantity;
		ingredients = new Ingredient[] {};
	}

	public void addIngredient(Ingredient ingredient) {
		if (ingredients.length == 7) {
			System.out.println("Pizza is full!");
		} else if (Arrays.asList(ingredients).contains(ingredient)) {
			System.out.println("This ingredient was added! Check your order!");
		} else {
			ingredients = Arrays.copyOf(ingredients, ingredients.length + 1);
			ingredients[ingredients.length - 1] = ingredient;
		}
	}

	public double getPizzaPrice() {
		return Arrays.stream(ingredients).mapToDouble(i -> i.getPrice()).sum() + pizzaType.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ingredient[] getIngredients() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "Pizza name: " + name + ", pizzaType: " + pizzaType + ", quantity: " + quantity;
	}
}
