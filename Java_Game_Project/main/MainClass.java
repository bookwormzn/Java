package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import characters.QuestionPanel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*JFrame game_frame = new JFrame("Welcome to the GAME!");
		game_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game_frame.setResizable(false);
		
		JPanel MAINPANEL = new JPanel();
	    GamePanel game_panel  = new GamePanel(); // Main panel of the Game
		QuestionPanel q = new QuestionPanel();
		
		game_panel.setGameObjects();
		game_panel.startGameThread();
	
		MAINPANEL.add(game_panel);
		MAINPANEL.add(q);
		game_frame.add(MAINPANEL);
		
		game_frame.pack();
		game_frame.setLocationRelativeTo(null);
		game_frame.setVisible(true);*/
		
		MainMethod main_method = new MainMethod();
		main_method.startTheGame();
		
	}

}
