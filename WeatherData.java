//The notifyObservers method calls a no-arg update method.
//There are now public accessors for the temp, humidity and pressure.

import java.util.*;

public class WeatherData {
	private Collection<WeatherDisplay> observers = new ArrayList<WeatherDisplay>();
	private float temperature;
	private float humidity;
	private float pressure;
	private String location;
	private WeatherController wc;
	private ComponentStyler style;
	
	public WeatherData(String location, ComponentStyler style) {
		this.location = location;
		wc = new WeatherController(this, style);
	}
	
	public void registerObserver(WeatherDisplay obs) {
	   observers.add(obs);
	}
	
	public void removeObserver(WeatherDisplay obs) {
	   observers.remove(obs);
	}
	
	public void notifyObservers() {
	   for (WeatherDisplay wd : observers)
	      wd.update(this);
	}
	
	public float getTemp() {
	   return temperature;
	}
	
	public float getHumidity() {
	   return humidity;
	}
	
	public float getPressure() {
	   return pressure;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void measurementsChanged() {
	   notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
	   this.temperature = temperature;
	   this.humidity = humidity;
	   this.pressure = pressure;
	   measurementsChanged();
	}
}

