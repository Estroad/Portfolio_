package Sort;


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class srtdr extends JFrame{
	private JLabel nosort;
	private JButton back;
	
	public srtdr(){
		JPanel drPanel = new JPanel();
		nosort = new JLabel("No contents to sort, please add some contents.");
		back = new JButton("back");
	
		back.addActionListener(new backListener());
	
		drPanel.add(nosort);
		drPanel.add(back);

		add(drPanel);
	pack();
		
		setVisible(true);
	}
private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
			//SortGui n = new SortGui();
			dispose();
		}
			
		}
	}
}
