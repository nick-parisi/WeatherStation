import javax.swing.*;


public class WeatherOutputFrame extends JFrame{
	
	private JPanel panel;
	private JTextField field;
	
	public WeatherOutputFrame(ComponentStyler style) {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(400,200);
		panel = style.colorPanel();
		field = style.colorTextField();
		panel.add(field);
		setContentPane(panel);
		setVisible(true);
	}
	
	public void setThisTitle(String title) { 
		setTitle(title);
	}
	public void setThisText(String text) {
		field.setText(text);
		pack();
		
	}


}
