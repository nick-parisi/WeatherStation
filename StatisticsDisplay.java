public class StatisticsDisplay implements WeatherDisplay {
   private float maxTemp = 0.0f;
   private float minTemp = 200;
   private float tempSum= 0.0f;
   private int numReadings;
   private String location;
   private ComponentStyler style;
   
   public StatisticsDisplay(WeatherData wd, ComponentStyler style) {
       wd.registerObserver(this);
       this.location = wd.getLocation();
       this.style = style;
   }
   
   public void update(WeatherData wd) {
      float temp = wd.getTemp();
      tempSum += temp;
      numReadings++;
      if (temp > maxTemp)
         maxTemp = temp;
      if (temp < minTemp)
         minTemp = temp;
      display();
   }
   
   public void display() {
	  WeatherOutputFrame output = new WeatherOutputFrame(style);
	  output.setThisTitle("Avg/Max/Min temperature for " + location);
	  output.setThisText((tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
      
   }
}

