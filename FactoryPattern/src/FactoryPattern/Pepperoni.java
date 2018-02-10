package FactoryPattern;

public abstract class Pepperoni {
	private String name;	
	
	public Pepperoni(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
