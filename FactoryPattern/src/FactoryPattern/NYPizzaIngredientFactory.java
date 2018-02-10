package FactoryPattern;

import java.util.ArrayList;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough getDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Clams getClams() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

	@Override
	public Sauce getSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese getCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public ArrayList<Veggies> getVeggies() {
		// TODO Auto-generated method stub
		ArrayList<Veggies> veggies =  new ArrayList<Veggies>();
		veggies.add(new Garlic());
		veggies.add(new Marshroom());
		veggies.add(new Onion());
		veggies.add(new RedPepper());
		return veggies;
	}

	@Override
	public Pepperoni getPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

}
