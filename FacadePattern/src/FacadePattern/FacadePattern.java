package FacadePattern;

public class FacadePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner();
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner);
		homeTheaterFacade.WatchMovie();
		homeTheaterFacade.EndMovie();
	}

}
