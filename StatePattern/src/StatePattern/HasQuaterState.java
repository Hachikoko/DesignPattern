package StatePattern;

import java.util.Random;

public class HasQuaterState extends State {
	GumballMachine machine;
	Random random = new Random(System.currentTimeMillis());
	
	public HasQuaterState(GumballMachine machine) {
		super();
		this.machine = machine;
	}
	
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Eject quater!!");
		machine.setState(machine.getNoQuaterState());
	}

	public void turnCrank() {
		System.out.println("You have turn the crank!!");
		int randomNumber = random.nextInt(10);
		if (randomNumber == 0 && machine.getRemainder()>1) {
			System.out.println("You are LUCKY!Get two gumballs!!");
			machine.setState(machine.getWinnerState());
		}else {
			machine.setState(machine.getSoldState());
		}
		machine.currentState.dispense();		
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Please turn the crank!!");
	}
	
}
