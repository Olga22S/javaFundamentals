package ru.epam.javaFundamentals.mainTask;

public class Main {

	public static void main(String[] args) {
		Order orderForFirstClient = new Order(7717);
		orderForFirstClient.addPizza(getMargarita(2));
		orderForFirstClient.addPizza(getPepperoniOro(3));
		System.out.println("Bill for client 7717:\n" + orderForFirstClient);
		Order orderForSecondClient = new Order(4372);
		orderForSecondClient.addPizza(getBasePzz(12));
		System.out.println("Bill for client 4372:\n" + orderForSecondClient);
	}

	private static Pizza getMargarita(int quantity) {
		Pizza margarita = new Pizza("Margarita", PizzaType.CALZONE, quantity);
		margarita.addIngredient(Ingredient.TOMATO_PASTE);
		margarita.addIngredient(Ingredient.PEPPER);
		margarita.addIngredient(Ingredient.GARLIC);
		margarita.addIngredient(Ingredient.BACON);
		return margarita;
	}

	private static Pizza getPepperoniOro(int quantity) {
		Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.ORDINARY, quantity);
		pepperoniOro.addIngredient(Ingredient.TOMATO_PASTE);
		pepperoniOro.addIngredient(Ingredient.CHEESE);
		pepperoniOro.addIngredient(Ingredient.PEPPERONI);
		pepperoniOro.addIngredient(Ingredient.OLIVES);
		return pepperoniOro;
	}

	private static Pizza getBasePzz(int quantity) {
		Pizza basePzz = new Pizza("BasePZZ", PizzaType.ORDINARY, quantity);
		basePzz.addIngredient(Ingredient.CHEESE);
		basePzz.addIngredient(Ingredient.PEPPERONI);
		basePzz.addIngredient(Ingredient.TOMATO_PASTE);
		return basePzz;
	}
}
