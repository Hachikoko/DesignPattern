package FactoryPattern;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory factory;
	
	public ClamPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setCheese(factory.getCheese());
		setClams(factory.getClams());
		setDough(factory.getDough());
		setName("ClamPizza");
		setPepperoni(factory.getPepperoni());
		setSauce(factory.getSauce());
		setVeggies(factory.getVeggies());
	}

}
