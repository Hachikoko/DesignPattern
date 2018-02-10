package FactoryPattern;

import java.util.ArrayList;

public interface PizzaIngredientFactory {
	public Dough getDough();
	public Clams getClams();
	public Sauce getSauce();
	public Cheese getCheese();
	public ArrayList<Veggies> getVeggies();
	public Pepperoni getPepperoni();
}
