package gui.view;

import javax.swing.*;
import gui.controller.GUIController;

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
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
