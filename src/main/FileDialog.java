package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileDialog implements ActionListener{
	Object button;
	JFrame frame;
    JFileChooser chooser = new JFileChooser(); 

	public FileDialog(JFrame frame, Object button){
		this.button = button;
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	        
		    chooser.setCurrentDirectory(new java.io.File("."));
		    chooser.setDialogTitle("Title");
		    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    //
		    // disable the "All files" option.
		    //
		    chooser.setAcceptAllFileFilterUsed(false);
		    //    
		    if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) { 
		      System.out.println("getCurrentDirectory(): " 
		         +  chooser.getCurrentDirectory());
		      System.out.println("getSelectedFile() : " 
		         +  chooser.getSelectedFile());
		      }
		    else {
		      System.out.println("No Selection ");
		      }
		     }
		   


}
