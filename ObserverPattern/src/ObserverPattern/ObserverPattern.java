package ObserverPattern;

public class ObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		WeatherDataStruct weatherDataStruct = new WeatherDataStruct(2,1,1);
		
		weatherData.setWeatherDataSturct(weatherDataStruct);
	}

}
