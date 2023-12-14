package characters;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import main.GamePanel;
public class Characters {

	public int worldX;
	public int worldY  ;
	public int speed;
	public GamePanel gp;
	
	public BufferedImage up_1, up_2, down_1, down_2, right_1, right_2, left_1, left_2, standard_2, up_NPC, down_NPC, right_NPC, left_NPC; // to store our (buffered) image files
	public String direction;
	public int sprite_counter = 0;
	public int number_of_sprites = 1;
	
	public Rectangle solidArea;
	public int solidArea_default_X, solidArea_default_Y;
	public boolean coll = false;

	public Characters (GamePanel gp)
	{
		this.gp = gp;
	}
	
	
	}

