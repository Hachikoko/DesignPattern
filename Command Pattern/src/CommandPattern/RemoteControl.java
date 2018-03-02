package CommandPattern;

public class RemoteControl {
	Command onCommands[];
	Command offCommands[];
	Command undoCommand;
	public RemoteControl() {
		super();
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];
		
		NoCommand noCommand = new NoCommand();
		
		for (int i = 0; i < offCommands.length; i++) {
			offCommands[i] = noCommand;
		}
		
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int index,Command onCommand,Command offCommand) {
		if (index<7 && index>=0) {
			onCommands[index] = onCommand;
			offCommands[index] = offCommand;
		}else {
			System.out.println("Wrong index!");
		}
		return;
	}
	
	public void pressOnButton(int index) {
		onCommands[index].excute();
		undoCommand = onCommands[index];
	}
	
	public void pressOffButton(int index) {
		offCommands[index].excute();
		undoCommand = offCommands[index];
	}
	
	public void pressUndoButton() {
		undoCommand.undo();
	}
	
}
