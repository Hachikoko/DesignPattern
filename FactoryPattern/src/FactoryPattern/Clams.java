package FactoryPattern;

public abstract class Clams {
	private String name;

	public Clams(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
