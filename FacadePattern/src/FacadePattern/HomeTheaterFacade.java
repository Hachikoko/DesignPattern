package FacadePattern;

public class HomeTheaterFacade {
	Amplifier amplifier;
	Tuner tuner;	
	
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
	}

	public void WatchMovie() {
		System.out.println("Get ready to watch a movie...");
		amplifier.on();
		tuner.on();
	}
	
	public void EndMovie() {
		System.out.println("Shutting movie theater down...");
		amplifier.off();
		tuner.off();
	}
}
