package main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainForm extends JFrame implements ActionListener{
	JFrame mainFrame = new JFrame();
	JButton exitButton = new JButton();
	JButton fileButton = new JButton();
	FileDialog fileChooser = new FileDialog(mainFrame, fileButton);
	
	public MainForm(){
		setup();
	}
	
	public void setup(){
		
		mainFrame.setTitle("DataSync");
		mainFrame.setSize(800, 550);
		exitButton.setText("Exit");
		exitButton.setSize(60, 25);
		fileButton.setText("Choose Directory");
		fileButton.setSize(150, 25);
		mainFrame.add(exitButton);
		exitButton.setLocation(0, mainFrame.getHeight() - 53);
		fileButton.setLocation(mainFrame.getWidth() - 650, mainFrame.getHeight() - 450);
		mainFrame.add(fileButton);
		mainFrame.setLayout(null);
		exitButton.addActionListener(this);
		fileButton.addActionListener(fileChooser);
		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == exitButton){
			System.exit(0);
		}
		
	}


}
