import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class MonoChrome implements ComponentStyler {
	private Color borderColor, backgroundColor;
	
	public MonoChrome(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		
		int green = backgroundColor.getGreen();
		int red = backgroundColor.getRed();
		int blue = backgroundColor.getBlue();
		//System.out.println(red + " " + blue + " " + green);
		
		if (red > 110) {
			red = red - 100;;
		}
		
		if (green > 110) {
			green = green - 100;
		}
		
		if (blue > 110) {
			blue = blue - 100;
		}
		borderColor = new Color(red, green, blue);
	}

	@Override
	public JButton colorButton() {
		JButton button = new JButton();
		button.setBorder(new LineBorder(borderColor,3));
		button.setBackground(backgroundColor);
		return button;
	}

	@Override
	public JTextField colorTextField() {
		JTextField field = new JTextField();
		field.setBorder(new LineBorder(borderColor,3));
		field.setBackground(backgroundColor);
		return field;
	}

	@Override
	public JPanel colorPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(borderColor));
		return panel;	
	}



}
