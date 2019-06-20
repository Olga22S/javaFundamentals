package ru.epam.javaFundamentals.mainTask;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Order {

	private final int orderNumber;
	private int clientNumber;
	private List<Pizza> pizzas;
	private LocalTime orderTime;

	public Order(int clientNumber) {
		orderNumber = new Random().ints(1, 10000, 99999 + 1).findFirst().getAsInt();
		this.clientNumber = clientNumber;
		pizzas = new ArrayList<>();
		orderTime = LocalTime.now();
	}

	public void addPizza(Pizza pizza) {
		if (getPizzaQuantityInOrger() + pizza.getQuantity() >= 10) {
			System.out.println("It isn't possible to order more than 10 pizzas!");
		} else {
			if (pizza.getName().length() < 4 || pizza.getName().length() > 20) {
				pizza.setName(getClientPizzaName());
			}
			pizzas.add(pizza);
		}
	}

	public void changePizzaQuantity(Pizza pizza, int quantity) {
		if (getPizzaQuantityInOrger() - pizza.getQuantity() + quantity >= 10) {
			System.out.println("It isn't possible to order more than 10 pizzas!");
		} else {
			pizzas.stream().filter(p -> p.equals(pizza)).forEach(p -> p.setQuantity(quantity));
		}
	}

	public String getPizzAttributes(Pizza pizza) {
		return "[" + orderNumber + ":" + clientNumber + ":" + pizza.getName() + ":" + pizza.getQuantity() + "]";
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		if (orderNumber != other.orderNumber) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "*".repeat(30) + System.lineSeparator() + getOrderInfo() + "*".repeat(30);
	}

	private int getPizzaQuantityInOrger() {
		return pizzas.stream().mapToInt(p -> p.getQuantity()).sum();
	}

	private String getClientPizzaName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your pizza name: ");
		return scanner.next() + "_" + (pizzas.size() + 1);
	}

	private String getOrderInfo() {
		StringBuilder formattedResult = new StringBuilder();
		formattedResult.append(String.format("%s%n%s%n", "Заказ: " + orderNumber, "Клиент: " + clientNumber));
		for (Pizza pizza : pizzas) {
			formattedResult.append(String.format("%s%n", "Название: " + pizza.getName()));
			formattedResult.append("-".repeat(30) + System.lineSeparator());
			formattedResult.append(String.format("%-8s%8s %c%n", "Pizza Base (" + pizza.getPizzaType() + ")",
					pizza.getPizzaType().getPrice(), '€'));
			for (Ingredient ingredient : pizza.getIngredients()) {
				formattedResult.append(String.format("%-14s%14s %c%n", ingredient, ingredient.getPrice(), '€'));
			}
			formattedResult.append("-".repeat(30) + System.lineSeparator());
			formattedResult.append(String.format("%-14s%14s %c%n", "Всего:", pizza.getPizzaPrice(), '€'));
			formattedResult.append(String.format("%-15s%15s%n", "Кол-во:", pizza.getQuantity()));
			formattedResult.append("-".repeat(30) + System.lineSeparator());
		}
		formattedResult.append(String.format("%-14s%14s %c%n", "Общая сумма:", getTotalPrice(), '€'));
		formattedResult.append(
				String.format("%-15s%15s%n", "Время заказа:", orderTime.format(DateTimeFormatter.ofPattern("HH:mm"))));
		return formattedResult.toString();
	}

	private double getTotalPrice() {
		return pizzas.stream().mapToDouble(p -> p.getPizzaPrice() * p.getQuantity()).sum();
	}
}
