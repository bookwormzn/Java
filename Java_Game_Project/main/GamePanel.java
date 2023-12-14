package main;

import javax.swing.JPanel;

import characters.Characters;
import characters.Player;
import objects.Objects;
import tiles.TileManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable {

    //SCREEN SETTINGS
	public final int OriginalTileSize = 19;
	public final int SCALE = 3;
	public final int TileSize = OriginalTileSize * SCALE; // 48 x 48 tile
	
	public final int MaxTiles_Column = 14;
	public final int MaxTiles_Row = 10;
	
	public final int ScreenWidth = MaxTiles_Column * TileSize; // 798 pixels
	public final int ScreenHeight = MaxTiles_Row * TileSize;  // 570 pixels
	
	//WORLD SETTINGS
	public final int MaxWorld_Column = 28;
	public final int MaxWorld_Row = 28;
	public final int World_Width = MaxWorld_Column * TileSize;
	public final int World_Height = MaxWorld_Row * TileSize;
	
	
	//FPS
	public int FPS = 60;
	
	//SYSTEM
	public TileManager tileM = new TileManager(this);
	KeyBoardInput key = new KeyBoardInput();
	SoundEffects sound_effects = new SoundEffects();
	public Collision c = new Collision(this);
	public ObjectSetter object_setter = new ObjectSetter(this);
	public UI GUI = new UI(this);
	Thread game_thread;
	
	//CHARACTERS AND OBJECTS
	public Objects obj[] = new Objects [10];
	public Player player = new Player(this, key);
	
	
	
	public GamePanel()
	{
		this.setPreferredSize(new Dimension(ScreenWidth , ScreenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // to improve rendering performance
		this.addKeyListener(key);
		this.setFocusable(true);
		
		
	}
	
	public void setGameObjects()
	{
		object_setter.setObject();
		playMusic(0);
		
	}
	
	
	public void startGameThread() 
	{
		game_thread = new Thread(this);
		game_thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		double drawInterval = 1000000000/FPS; // Game Loop: Delta/Accumulator method
		double delta = 0;                     // Game Loop: Delta/Accumulator method
		long lastTime = System.nanoTime();    // Game Loop: Delta/Accumulator method
		long currentTime;                     // Game Loop: Delta/Accumulator method
		
		
		while (game_thread != null)
	  {
			currentTime = System.nanoTime();                   // Game Loop: Delta/Accumulator method
	        delta += (currentTime - lastTime) / drawInterval;  // Game Loop: Delta/Accumulator method
	        lastTime = currentTime;                            // Game Loop: Delta/Accumulator method
	         
	        if (delta >= 1)                                    // Game Loop: Delta/Accumulator method
	        {
	        	update(); // update information (eg. character position)
				
				repaint(); // redraw the screen based on the update information ---> calls paintComponent() method 
				
				delta--;                                      // Game Loop: Delta/Accumulator method
	        }
		
			
		}
	}
		
		public void update()
		{
	      player.update();
		}
		
		
		public void paintComponent (Graphics g) // built-in method ---> like a (toolbrush)
		{
			super.paintComponent(g); // calls the method of the super class "JPanel"
			
			Graphics2D g2 = (Graphics2D)g; // Graphics2D class extends Graphics class ---> has more useful tools 
			
			//TILE
			tileM.draw(g2);
			
			//OBJECT
			for (int i = 0 ; i < obj.length ; i++)
			{
				if (obj[i] != null)
					obj[i].draw(g2, this);
			}
			
			
			//PLAYER
			player.draw(g2);
			
			//UI
			GUI.draw(g2);
			
			g2.dispose(); 
			
			
		}
		
		public void playMusic(int i)
		{
			sound_effects.setFile(i);
			sound_effects.play();
			sound_effects.loop();
		}
		
		public void stopMusic()
		{
			sound_effects.stop();
		}
		
		public void playSoundEffects(int i)
		{
			sound_effects.setFile(i);
			sound_effects.play();
		}
}

















