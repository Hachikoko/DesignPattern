package DecorativePattern;

public class DecorativePattern {

	public static void main(String[] args) {
		HousBlend housBlend = new HousBlend(1, "HousBlend");
		Milk milk = new Milk(housBlend, 2, "Milk");
		System.out.println(milk.getCost()+" "+milk.getDescription());
		milk = new Milk(milk, 2, "Milk");
		System.out.println(milk.getCost()+" "+milk.getDescription());
	}
}
