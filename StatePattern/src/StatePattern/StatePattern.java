package StatePattern;

public class StatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine machine = new GumballMachine(5);
		machine.insertQuater();
		machine.insertQuater();
		machine.ejectQuarter();
		machine.ejectQuarter();
		machine.turnCrank();
		machine.insertQuater();
		machine.turnCrank();
	}

}
