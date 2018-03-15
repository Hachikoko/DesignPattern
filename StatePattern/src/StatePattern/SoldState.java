package StatePattern;

public class SoldState extends State {
	GumballMachine machine;
	public SoldState(GumballMachine machine) {
		super();
		this.machine = machine;
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		machine.release();
		if (machine.getRemainder()>0) {
			machine.setState(machine.getNoQuaterState());
		}else if(machine.getRemainder() == 0) {
			machine.setState(machine.getSoledOutState());
			System.out.println("The gumballs have been sold out!");
		}
	}
}
