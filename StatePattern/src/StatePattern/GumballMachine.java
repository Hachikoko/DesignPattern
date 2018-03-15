package StatePattern;

public class GumballMachine {
	State noQuaterState;
	State hasQuaterState;
	State soldState;
	State winnerState;
	State soledOutState;
	
	State currentState;
	int remainder;
	
	public GumballMachine(int remainder) {
		super();
		this.noQuaterState = new NoQuaterState(this);
		this.hasQuaterState = new HasQuaterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.soledOutState = new SoldOutState(this);
		
		currentState = noQuaterState;
		this.remainder = remainder; 
	}
	
	public void setState(State state) {
		this.currentState = state;
	}

	public State getNoQuaterState() {
		return noQuaterState;
	}

	public State getHasQuaterState() {
		return hasQuaterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public State getSoledOutState() {
		return soledOutState;
	}

	public State getCurrentState() {
		return currentState;
	}

	public int getRemainder() {
		return remainder;
	}
	
	public void insertQuater() {
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
	}
	
	public void reFull() {
		if (currentState == hasQuaterState||currentState==soldState||currentState == winnerState) {
			System.out.println("Please try again! The machin is working!!");
		}else {
			remainder = 5;
			currentState = noQuaterState;
		}
	}
	
	public void release() {
		if (remainder>0) {
			remainder--;
			System.out.println("A gumball come rolling out the slot...");
		}
		
	}
	
}
