package ObserverPattern_JDK;

import java.util.Observable;

public class WeatherData extends Observable {
	private WeatherDataStruct weatherDataStruct;
	
	public void setWeatherDataSturct(WeatherDataStruct weatherDataStruct) {
		this.weatherDataStruct = weatherDataStruct;
		measurementChanged();
	}
	
	private void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public WeatherDataStruct getWeatherDataSturct() {
		return weatherDataStruct;
	}
}
