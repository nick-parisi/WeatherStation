import java.awt.Color;

public class WeatherStation {

	public static void main(String[] args) {
		//HW4 main class
		/*WeatherData weatherData = new WeatherData("Boston");
		WeatherData weatherData2 = new WeatherData("Miami");
		WeatherData weatherData3 = new WeatherData("Chicago");

		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		new CurrentConditionsDisplay(weatherData2);
		new StatisticsDisplay(weatherData2);
		new ForecastDisplay(weatherData2);
		
		new CurrentConditionsDisplay(weatherData3);
		new StatisticsDisplay(weatherData3);
		new ForecastDisplay(weatherData3);
		*/
		
		//HW6 main class
		ComponentStyleFactory csf = ComponentStyleFactory.instance();
		Color gold = new Color(255, 215, 0);
		Color maroon = new Color(128, 0, 0);
		ComponentStyler bc = csf.create(maroon, gold);
		ComponentStyler umich = csf.create(Color.BLUE, Color.YELLOW);
		ComponentStyler red = csf.createMonochrome(Color.RED);
		ComponentStyler blue = csf.createMonochrome(Color.BLUE);
		ComponentStyler green = csf.createMonochrome(Color.GREEN);
		

		WeatherData annarbor = new WeatherData("Ann Arbor", umich);
		WeatherData boston = new WeatherData("Boston", bc);
		
		
		new CurrentConditionsDisplay(annarbor, red);
		new CurrentConditionsDisplay(boston, red);
		
		new StatisticsDisplay(annarbor, green);
		new StatisticsDisplay(boston, green);
		
		new ForecastDisplay(annarbor, blue);
		new ForecastDisplay(boston, blue);

	
	}
}

