
public abstract class CaffeineBeverage {
	 public final void prepareRecipe() {
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}
	 
	 abstract void brew();
	  
	 abstract void addCondiments();
	 
	 private void boilWater() {
		System.out.println("boil water!!");
	}
	 
	 private void pourInCup() {
		System.out.println("Pour in cup!!");
	}
	 
}
