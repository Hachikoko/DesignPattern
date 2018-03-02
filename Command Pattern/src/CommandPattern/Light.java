package CommandPattern;

public class Light {
	String lightName;
	
	public Light(String lightName) {
		super();
		this.lightName = lightName;
	}

	public void on() {
		System.out.println(lightName+"is on!");
	}
	
	public void off() {
		System.out.println(lightName+"is off!");
	}
}
