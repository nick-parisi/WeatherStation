
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class WeatherController extends JFrame {
	private WeatherData wd;
	private JTextField temp, humidity, pressure;
	
	
	
	
	public WeatherController(WeatherData wd, ComponentStyler style) {
		this.wd = wd; 
		setTitle("Enter Weather For " + wd.getLocation());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(200,200);
		
		JPanel panel 	= style.colorPanel();
		temp	= style.colorTextField();
		humidity = style.colorTextField();
		pressure = style.colorTextField();
		JLabel tempLabel = new JLabel();
		JLabel humidityLabel = new JLabel();
		JLabel pressureLabel = new JLabel();
		JButton enter	= style.colorButton();
		
		
		setContentPane(panel);
		setVisible(true);
		
		
		panel.setLayout(new GridLayout(1,6));
		panel.add(tempLabel);
		panel.add(temp);
		panel.add(pressureLabel);
		panel.add(pressure);
		panel.add(humidityLabel);
		panel.add(humidity);
		panel.add(enter);
		pack();
	
		
		tempLabel.setText("Temperature :");
		pressureLabel.setText("Pressure: ");
		humidityLabel.setText("Humidity: ");
		enter.setText("ENTER");
	
		
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				float tempVal = new Float(temp.getText());
				float pressureVal = new Float(pressure.getText());
				float humidityVal = new Float(humidity.getText());
				
				synch(tempVal, humidityVal, pressureVal);
				
			}
		});
		
		
	}
	
	public void synch(float tempVal, float humidityVal, float pressureVal) {
		wd.setMeasurements(tempVal, humidityVal, pressureVal);
	}
}
