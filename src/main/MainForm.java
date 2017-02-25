package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainForm extends JFrame implements ActionListener{
	JFrame mainFrame = new JFrame();
	JButton exitButton = new JButton();
	
	public MainForm(){
		setup();
	}
	
	public void setup(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (true){
			
		}
	}


}
