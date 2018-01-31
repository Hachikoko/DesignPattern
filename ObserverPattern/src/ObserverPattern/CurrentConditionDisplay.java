package ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private WeatherDataStruct weatherDataStruct;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void updata(WeatherDataStruct weatherDataStruct) {
		// TODO Auto-generated method stub
		this.weatherDataStruct = weatherDataStruct;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Temperature:" + weatherDataStruct.temprature + " Humidity:" + weatherDataStruct.humidity
				+ " Pressure:" + weatherDataStruct.pressure);
	}

}
