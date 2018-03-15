package StatePattern;

public abstract class State {
	public void insertQuarter() {
		System.out.println("You can't insert another quarter!");
	}
	
	public void ejectQuarter() {
		System.out.println("Sorry! You already turned the cranl!");
	}
	
	public void turnCrank() {
		System.out.println("Sorry! You can't turn the crank twice!");
	}
	
	public void dispense() {
		System.out.println("Sorry! There is no gumball!");
	}
}
