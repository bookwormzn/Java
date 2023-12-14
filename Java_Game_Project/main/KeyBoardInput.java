package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardInput implements KeyListener {

	public boolean moveUP, moveDOWN, moveRIGHT, moveLEFT; 

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//(NOT USED)//
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int input = e.getKeyCode();
		
		if (input == KeyEvent.VK_W)
		{
			moveUP = true;
		}
		
		if (input == KeyEvent.VK_S)
		{
			moveDOWN = true;
		}
		
		if (input == KeyEvent.VK_A)
		{
			moveLEFT = true;
		}
		
		if (input == KeyEvent.VK_D)
		{
			moveRIGHT = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
int input = e.getKeyCode();
		
		if (input == KeyEvent.VK_W)
		{
			moveUP = false;
		}
		
		if (input == KeyEvent.VK_S)
		{
			moveDOWN = false;
		}
		
		if (input == KeyEvent.VK_A)
		{
			moveLEFT = false;
		}
		
		if (input == KeyEvent.VK_D)
		{
			moveRIGHT = false;
		}
	}
}
