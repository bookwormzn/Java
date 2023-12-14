package main;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Graphics2D;
import java.awt.Color;
import objects.Document_Object;

public class UI {

	
	GamePanel gp;
	Font font, font2, fontFINAL;
	BufferedImage document_image;
	
	BufferedImage message; 
    public boolean message_visible = false;
    public String messageText = "";
    public int message_time_counter = 0;
    public boolean GameOver = false;
    public boolean GameWon = false;
    
    double timer;
    DecimalFormat df = new DecimalFormat("#0.00");
	
	
	public UI (GamePanel gp)
	{
		this.gp = gp;
		font = new Font("verdana", Font.PLAIN, 30);
		font2 = new Font("arial", Font.BOLD, 20);
		fontFINAL = new Font("bookman old style", Font.BOLD, 80);
		Document_Object doc = new Document_Object();
		document_image = doc.image;
		try  { message = ImageIO.read(getClass().getResourceAsStream("/messages/message.png")); }
		catch(IOException e) {e.printStackTrace();}
	}
	
	public void showMessage(String messageText)
	{
		this.messageText = messageText;
		message_visible = true;
	}
	
	public void draw(Graphics2D g2)
	{
		
		if (GameOver == true)
		{	
			String text;
			int text_length;
			int x;
			int y;
			
			g2.setFont(g2.getFont().deriveFont(40F));
			g2.setColor(Color.white);
		    text = "YOU LOST ALL OF YOUR SOULS!";
			text_length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.ScreenWidth/2 - text_length/2;
			y = gp.ScreenHeight/2 - (gp.TileSize * 3);
			g2.drawString(text, x, y);
			
			g2.setFont(fontFINAL);
			g2.setColor(Color.red);
			text = "YOU ARE FIRED!";
			text_length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.ScreenWidth/2 - text_length/2;
			y = gp.ScreenHeight/2 + (gp.TileSize * 2);
			g2.drawString(text, x, y);
			
			gp.game_thread = null;

		}
		
		else if (GameWon == true)
		{
			String text;
			int text_length;
			int x;
			int y;
			
			g2.setFont(g2.getFont().deriveFont(40F));
			g2.setColor(Color.white);
		    text = "YOU ESCAPED THE POLICE!";
			text_length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.ScreenWidth/2 - text_length/2;
			y = gp.ScreenHeight/2 - (gp.TileSize * 3);
			g2.drawString(text, x, y);
			
			g2.setFont(g2.getFont().deriveFont(40F));
			g2.setColor(Color.white);
		    text = "Your Time is: " + df.format(timer) + "!";
			text_length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.ScreenWidth/2 - text_length/2;
			y = gp.ScreenHeight/2 + (gp.TileSize * 4);
			g2.drawString(text, x, y);
			
			g2.setFont(g2.getFont().deriveFont(60F));
			g2.setColor(Color.yellow);
			text = "CONGRATULATIONS!";
			text_length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.ScreenWidth/2 - text_length/2;
			y = gp.ScreenHeight/2 + (gp.TileSize * 2);
			g2.drawString(text, x, y);
			
			gp.game_thread = null;
		}
		
		else 
		{
		
			
			//DOCUMENT
			g2.setFont(font);
			g2.setColor(Color.red);
			g2.fillRect(10, 7, gp.TileSize*2, gp.TileSize-10);
			g2.setColor(Color.black);
			g2.drawRect(10, 7, gp.TileSize*2, gp.TileSize-10);
			g2.setColor(Color.white);
			g2.drawImage(document_image, 10, 1, gp.TileSize, gp.TileSize, null);
			g2.drawString("x " + gp.player.Document_NUM, 65, 40);
			
			//TIMER 
			timer += (double)1/60;

			g2.setFont(font);
			g2.setColor(Color.red);
			g2.fillRect(565, 7, 230, gp.TileSize-10);
			g2.setColor(Color.black);
			g2.drawRect(565, 7, 230, gp.TileSize-10);
			g2.setColor(Color.white);
			g2.drawString("Timer: " + df.format(timer), 570, 40);
			
			//MESSAGE
			if (message_visible == true)
			{
				g2.drawImage(message, 8, 470, 300, 100, null);
				g2.setFont(font2);
				g2.setColor(Color.black);
				g2.drawString(messageText, 52, 515);
				
				message_time_counter++;
				
				if (message_time_counter >120)
				{
					message_time_counter = 0;
					message_visible = false;
		}
		
			}
		}
	}


   










}
