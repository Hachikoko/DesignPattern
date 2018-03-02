package CommandPattern;

public class CommandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new RemoteControl();
		Light sittingRoomLight = new Light("SittingRoomLight");
		SittingRoomLightOffCommand sittingRoomLightOffCommand = new SittingRoomLightOffCommand(sittingRoomLight);
		SittingRoomLightOnCommand sittingRoomLightOnCommand = new SittingRoomLightOnCommand(sittingRoomLight);
		remoteControl.setCommand(0, sittingRoomLightOnCommand, sittingRoomLightOffCommand);
		remoteControl.pressOnButton(0);
		remoteControl.pressOffButton(0);
		remoteControl.pressUndoButton();
	}

}
