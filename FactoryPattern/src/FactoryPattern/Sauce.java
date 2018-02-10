package FactoryPattern;

public abstract class Sauce {
	private String name;

	public Sauce(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
