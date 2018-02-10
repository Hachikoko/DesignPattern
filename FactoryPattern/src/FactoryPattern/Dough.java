package FactoryPattern;

public abstract class Dough {
	private String name;	
	
	public Dough(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
