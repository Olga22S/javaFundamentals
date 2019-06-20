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
		Pizza margarita = new Pizza("Margarita", PizzaType.Calzone, quantity);
		margarita.addIngredient(Ingredient.TomatoPaste);
		margarita.addIngredient(Ingredient.Pepper);
		margarita.addIngredient(Ingredient.Garlic);
		margarita.addIngredient(Ingredient.Bacon);
		return margarita;
	}

	private static Pizza getPepperoniOro(int quantity) {
		Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.Ordinary, quantity);
		pepperoniOro.addIngredient(Ingredient.TomatoPaste);
		pepperoniOro.addIngredient(Ingredient.Cheese);
		pepperoniOro.addIngredient(Ingredient.Pepperoni);
		pepperoniOro.addIngredient(Ingredient.Olives);
		return pepperoniOro;
	}

	private static Pizza getBasePzz(int quantity) {
		Pizza basePzz = new Pizza("BasePZZ", PizzaType.Ordinary, quantity);
		basePzz.addIngredient(Ingredient.Cheese);
		basePzz.addIngredient(Ingredient.Pepperoni);
		basePzz.addIngredient(Ingredient.TomatoPaste);
		return basePzz;
	}
}
