public class ForecastDisplay implements WeatherDisplay {
   private float currentpressure = 29.27f;
   private float oldpressure;
   private String location;
   private ComponentStyler style;
   
   public ForecastDisplay(WeatherData wd, ComponentStyler style) {
      wd.registerObserver(this);
      this.location = wd.getLocation();
      this.style = style;
   }
   
   public void update(WeatherData wd) {
      oldpressure = currentpressure;
      currentpressure = wd.getPressure();
      display();
   }
   
   public void display() {
	  WeatherOutputFrame output = new WeatherOutputFrame(style);
	  output.setThisTitle("Forecast for " + location);
      if (currentpressure > oldpressure)
         output.setThisText("Improving weather on the way!");
      else if (currentpressure == oldpressure)
         output.setThisText("More of the same");
      else
         output.setThisText("Watch out for cooler, rainy weather");
   }
}

