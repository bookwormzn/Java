package characters;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;


public class QuestionPanel extends JPanel {

	
	static JLabel input;
	
	public QuestionPanel()
	{
		this.setPreferredSize(new Dimension(400 , 570));
		this.setBackground(Color.white);
		
		JLabel welcome = new JLabel("Welcome");
		welcome.setFont(new Font("AppleGothic", Font.BOLD, 20));
		this.add(welcome);

	}
	
}


 class QuestionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}