package FactoryPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.OrderPizza("ClamPizza");
		if (pizza != null) {
			System.out.println(pizza.toString());
		}
		
	}
}
