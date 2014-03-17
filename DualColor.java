import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class DualColor implements ComponentStyler{
	private Color borderColor, backgroundColor;
	
	public DualColor(Color borderColor, Color backgroundColor){
		this.borderColor = borderColor;
		this.backgroundColor = backgroundColor;
	}
	
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
