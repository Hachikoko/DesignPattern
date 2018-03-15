package StatePattern;

public class SoldOutState extends State {
	GumballMachine machine;

	public SoldOutState(GumballMachine machine) {
		super();
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry! There is no gumball!");
	}
	
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert quater and there is no ejection!");
	}
	
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sorry! There is no gumball and you can't turn the crank!");
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball,no dispen!");
	}
	
}
