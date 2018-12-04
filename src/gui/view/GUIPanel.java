package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JLabel textLabel;
	private JButton colorButton;
	
	public GUIPanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("What is a spring layout");
		textLabel.setForeground(Color.YELLOW);
		textLabel.setBackground(Color.CYAN);
		textLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD | Font.ITALIC, 24));
		this.colorButton = new JButton("I did it!!!!!");
		colorButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		colorButton.setBackground(SystemColor.desktop);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, colorButton, 246, SpringLayout.SOUTH, textLabel);
		springLayout.putConstraint(SpringLayout.WEST, colorButton, 0, SpringLayout.WEST, textLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, colorButton, 419, SpringLayout.SOUTH, textLabel);
		springLayout.putConstraint(SpringLayout.EAST, colorButton, 598, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, textLabel, 314, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, textLabel, -408, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, textLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, textLabel, 51, SpringLayout.NORTH, this);
		setLayout(springLayout);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundColor();
			}
		});
		// this is one large line of code thats why the parenthesis is at the end of the method
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red,green,blue));
		textLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
}
