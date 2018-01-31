package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private WeatherDataStruct weatherDataStruct;
	private ArrayList<Observer> observers;
	

	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(observer);
		if (i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.updata(weatherDataStruct);
		}
	}
	
	public void setWeatherDataSturct(WeatherDataStruct weatherDataStruct) {
		this.weatherDataStruct = weatherDataStruct;
		measurementChanged();
		
	}
	
	private void measurementChanged() {
		notifyObservers();
	}
	
	

}
