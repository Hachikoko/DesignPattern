package FactoryPattern;


public abstract class Veggies {
	private String name;

	public Veggies(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
