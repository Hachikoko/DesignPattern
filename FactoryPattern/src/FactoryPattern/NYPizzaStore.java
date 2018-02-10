package FactoryPattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String pizzaName) {
		// TODO Auto-generated method stub
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		Pizza pizza = null;
		switch (pizzaName) {
		case "ClamPizza":
			pizza = new ClamPizza(factory);
			break;

		default:
			System.out.println("No such pizza!");
			break;
		}
		return pizza;
	}

}
