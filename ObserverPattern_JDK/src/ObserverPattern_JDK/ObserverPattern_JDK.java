package ObserverPattern_JDK;

public class ObserverPattern_JDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setWeatherDataSturct(new WeatherDataStruct(1,2,3));
	}

}
