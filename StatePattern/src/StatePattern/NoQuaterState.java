package StatePattern;

public class NoQuaterState extends State{
	GumballMachine machine;	
	
	public NoQuaterState(GumballMachine machine) {
		super();
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("You insert quater!!");
		machine.setState(machine.getHasQuaterState());
	}
	
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("There is no quater!");
	}
	
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Please insert the quater first!");
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Please insert the quater first and then turn the crank!");
	}
}
