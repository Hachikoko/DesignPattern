package CommandPattern;

public class NoCommand implements Command {
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("No command!");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("No command!");
	}

}
