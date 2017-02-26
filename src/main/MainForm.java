package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame implements ActionListener{
	JFrame mainFrame = new JFrame();
	JButton exitButton = new JButton();
	JButton fileButton = new JButton();
	JPanel filePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	FileDialog fileChooser = new FileDialog(mainFrame, fileButton);
	
	public MainForm(){
		setup();
	}
	
	public void setup(){
		mainFrame.setTitle("DataSync");
		mainFrame.setSize(800, 550);
		buttonPanel.setSize(400, 550);
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		filePanel.setSize(400, 550);
		filePanel.setBackground(Color.GRAY);
		exitButton.setText("Exit");
		exitButton.setSize(60, 25);
		fileButton.setText("Choose Directory");
		fileButton.setSize(150, 25);
		buttonPanel.add(exitButton);
		exitButton.setLocation(0,200);
		fileButton.setLocation(200, 200);
		buttonPanel.add(fileButton);
		mainFrame.setLayout(null);
		filePanel.add(fileChooser.chooser);
		mainFrame.add(buttonPanel, BorderLayout.CENTER);
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
