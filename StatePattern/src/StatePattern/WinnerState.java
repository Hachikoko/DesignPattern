package StatePattern;

public class WinnerState extends State{
	GumballMachine machine;

	public WinnerState(GumballMachine machine) {
		super();
		this.machine = machine;
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		machine.release();
		System.out.println("First one!");
		machine.release();
		System.out.println("Second one!");
		
		if (machine.getRemainder()>0) {
			machine.setState(machine.getNoQuaterState());
		}else {
			machine.setState(machine.getSoledOutState());
		}
	}
}
