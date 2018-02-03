package DecorativePattern;

public class CondimentDecorator extends Beverage {
	private Beverage beverage;
	
	public CondimentDecorator(String description, float cost,Beverage beverage) {
		super(description, cost);
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	public Beverage getBeverage() {
		return beverage;
	}
}
