package DecorativePattern;

public class Milk extends CondimentDecorator {


	
	public Milk(Beverage beverage,float cost,String description) {
		super(description, cost,beverage);
		// TODO Auto-generated constructor stubbe
		setCost(beverage.getCost()+cost);
		setDescription(beverage.getDescription()+description);
		
	}
	
	
	
	
}
