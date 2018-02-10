package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private ArrayList<Veggies> veggies;
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clams;

	public abstract void prepare();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public ArrayList<Veggies> getVeggies() {
		return veggies;
	}

	public void setVeggies(ArrayList<Veggies> veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}

	void bake() {
		System.out.println("baking......");
	}

	void cut() {
		System.out.println("cutting......");
	}

	void box() {
		System.out.println("boxing......");
	}

	public String toString() {
		String tempVeggies = "";
		for (int i = 0; i < veggies.size(); i++) {
			tempVeggies += veggies.get(i).getName() + " ";
		}
		tempVeggies = tempVeggies.substring(0, tempVeggies.length() - 2);
		
		return name + ":" + dough.getName() + "、" + sauce.getName() + "、" + tempVeggies + "、" + cheese.getName() + "、"
				+ pepperoni.getName() + "、" + clams.getName();
	}
}
