package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JLabel textLabel;
	private JButton colorButton;
	
	public GUIPanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("This is a color app!");
		this.colorButton = new JButton("Click here to change color");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
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
