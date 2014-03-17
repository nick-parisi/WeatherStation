public class CurrentConditionsDisplay implements WeatherDisplay {
   private float temp;
   private float humidity;
   private String location;
   private ComponentStyler style;
   
   public CurrentConditionsDisplay(WeatherData wd, ComponentStyler style) {
      wd.registerObserver(this);
      this.location = wd.getLocation();
      this.style = style;
   }
   
   public void update(WeatherData wd) {
      this.temp = wd.getTemp();
      this.humidity = wd.getHumidity();
      display();
   }
   
   public void display() {
	  WeatherOutputFrame output = new WeatherOutputFrame(style);
	  output.setThisTitle("Current conditions for " + location);
	  output.setThisText(temp + "F degrees and " + humidity + "% humidity");
      
   }
}

