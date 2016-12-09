package frame;

import javax.swing.*;
import javax.*;


public class Frame {
	
	public static void main(String[]args){
	
		
		JFrame f1 = new JFrame();
		JPanel p1 = new JPanel();
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f1.setUndecorated(false);
		f1.setVisible(true);
		f1.add(p1);
		
	}

}
