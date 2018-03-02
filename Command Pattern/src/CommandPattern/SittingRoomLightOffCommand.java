package CommandPattern;

public class SittingRoomLightOffCommand implements Command {
	Light sittingRoomLight;
	
	
	public SittingRoomLightOffCommand(Light sittingRoomLight) {
		super();
		this.sittingRoomLight = sittingRoomLight;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		sittingRoomLight.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		sittingRoomLight.on();
	}

}
