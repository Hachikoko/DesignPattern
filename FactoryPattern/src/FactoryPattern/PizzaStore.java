package FactoryPattern;

public abstract class PizzaStore {
	public Pizza OrderPizza(String pizzaName) {
		Pizza pizza = createPizza(pizzaName);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(String pizzaName);
}
