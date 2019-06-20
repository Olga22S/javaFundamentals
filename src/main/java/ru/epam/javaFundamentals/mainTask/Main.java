package ru.epam.javaFundamentals.mainTask;

public class Main {

	public static void main(String[] args) {
		int firstClientNumber = 7717;
		int secondClientNumber = 4372;
		Order order1 = new Order(firstClientNumber);
		order1.addPizza(getMargarita(order1.getOrderNumber(), firstClientNumber, 2));
		order1.addPizza(getPepperoniOro(order1.getOrderNumber(), firstClientNumber, 3));
		Order order2 = new Order(secondClientNumber);
		order2.addPizza(getBasePzz(order2.getOrderNumber(), secondClientNumber, 9));
		Order order3 = new Order(secondClientNumber);
		order3.addPizza(getBasePzz(order3.getOrderNumber(), secondClientNumber, 3));	
		System.out.println("Bill for client 7717:\n" + order1+"\n");
		System.out.println("Bill for client 4372:\n" + order2 + "\n"+order3);
	}

	private static Pizza getMargarita(int orderNumber, int clientNumber, int quantity) {
		Pizza margarita = new Pizza(orderNumber, clientNumber, "Margarita", PizzaType.Calzone, quantity);
		margarita.addIngredient(Ingredient.TomatoPaste);
		margarita.addIngredient(Ingredient.Pepper);
		margarita.addIngredient(Ingredient.Garlic);
		margarita.addIngredient(Ingredient.Bacon);
		return margarita;
	}

	private static Pizza getPepperoniOro(int orderNumber, int clientNumber, int quantity) {
		Pizza pepperoniOro = new Pizza(orderNumber, clientNumber, "PepperoniOro", PizzaType.Ordinary, quantity);
		pepperoniOro.addIngredient(Ingredient.TomatoPaste);
		pepperoniOro.addIngredient(Ingredient.Cheese);
		pepperoniOro.addIngredient(Ingredient.Pepperoni);
		pepperoniOro.addIngredient(Ingredient.Olives);
		return pepperoniOro;
	}

	private static Pizza getBasePzz(int orderNumber, int clientNumber, int quantity) {
		Pizza basePzz = new Pizza(orderNumber, clientNumber, "BasePZZ", PizzaType.Ordinary, quantity);
		basePzz.addIngredient(Ingredient.Cheese);
		basePzz.addIngredient(Ingredient.Pepperoni);
		basePzz.addIngredient(Ingredient.TomatoPaste);
		return basePzz;
	}
}
