package FactoryPattern;

public abstract class Cheese {
	private String name;

	public Cheese(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
