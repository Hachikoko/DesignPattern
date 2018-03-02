package CommandPattern;

public class SittingRoomLightOnCommand implements Command {
	Light sittingRoomLight;
	
	
	public SittingRoomLightOnCommand(Light sittingRoomLight) {
		super();
		this.sittingRoomLight = sittingRoomLight;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		sittingRoomLight.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		sittingRoomLight.off();
	}

}
