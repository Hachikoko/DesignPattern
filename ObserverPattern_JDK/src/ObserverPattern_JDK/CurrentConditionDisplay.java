package ObserverPattern_JDK;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
	private WeatherDataStruct weatherDataStruct;
	private Observable weatherData;
	
	
	
	public CurrentConditionDisplay(Observable weatherData) {
		super();
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}



	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg0 instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)arg0;
			weatherDataStruct = weatherData.getWeatherDataSturct();
			display();
		}
	}
	
	private void display() {
		System.out.println("Temperature:"+weatherDataStruct.temperature+" Humidity:"+weatherDataStruct.humidity+" Pressure:"+weatherDataStruct.pressure);
	}

}
