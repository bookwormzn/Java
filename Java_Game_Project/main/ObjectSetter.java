package main;

import java.util.Random;
import objects.Car_Object;
import objects.Document_Object;
import objects.Key_Object;

public class ObjectSetter {

	GamePanel gp;
	
	public ObjectSetter(GamePanel gp)
	{
		this.gp = gp;
	}
	

	public void setObject()
	{
		
		gp.obj[9] = new Car_Object();
		gp.obj[9].worldX = 27 * gp.TileSize;
		gp.obj[9].worldY = 0* gp.TileSize ;
		
		Random r = new Random();
		int rand = r.nextInt(4) + 1;
		
		switch (rand) {
		
		case 1:
			
			gp.obj[0] = new Document_Object();
			gp.obj[0].worldX = 7 * gp.TileSize;
			gp.obj[0].worldY = 8 * gp.TileSize ;
			
			gp.obj[1] = new Document_Object();
			gp.obj[1].worldX = 1 * gp.TileSize;
			gp.obj[1].worldY = 1 * gp.TileSize ;
			
			gp.obj[2] = new Document_Object();
			gp.obj[2].worldX = 16 * gp.TileSize;
			gp.obj[2].worldY = 1 * gp.TileSize ;
			
			gp.obj[3] = new Document_Object();
			gp.obj[3].worldX = 24 * gp.TileSize;
			gp.obj[3].worldY = 11 * gp.TileSize ;
		
			gp.obj[4] = new Document_Object();
			gp.obj[4].worldX = 0 * gp.TileSize;
			gp.obj[4].worldY = 4 * gp.TileSize ;
			
			gp.obj[5] = new Document_Object();
			gp.obj[5].worldX = 10 * gp.TileSize;
			gp.obj[5].worldY = 4 * gp.TileSize ;
			
			
			break;
			
		case 2:
			
			gp.obj[0] = new Document_Object();
			gp.obj[0].worldX = 7 * gp.TileSize;
			gp.obj[0].worldY = 8 * gp.TileSize ;
			
			gp.obj[1] = new Document_Object();
			gp.obj[1].worldX = 1 * gp.TileSize;
			gp.obj[1].worldY = 1 * gp.TileSize ;
			
			gp.obj[2] = new Document_Object();
			gp.obj[2].worldX = 16 * gp.TileSize;
			gp.obj[2].worldY = 1 * gp.TileSize ;
			
			gp.obj[3] = new Document_Object();
			gp.obj[3].worldX = 24 * gp.TileSize;
			gp.obj[3].worldY = 11 * gp.TileSize ;
			
			gp.obj[4] = new Document_Object();
			gp.obj[4].worldX = 7 * gp.TileSize;
			gp.obj[4].worldY = 13 * gp.TileSize ;
			
			gp.obj[5] = new Document_Object();
			gp.obj[5].worldY = 3 * gp.TileSize ;
			
			
			break;
			
		case 3:
			
			gp.obj[0] = new Document_Object();
			gp.obj[0].worldX = 11 * gp.TileSize;
			gp.obj[0].worldY = 1 * gp.TileSize ;
			
			gp.obj[1] = new Document_Object();
			gp.obj[1].worldX = 13 * gp.TileSize;
			gp.obj[1].worldY = 6 * gp.TileSize ;
			
			gp.obj[2] = new Document_Object();
			gp.obj[2].worldX = 25 * gp.TileSize;
			gp.obj[2].worldY = 13 * gp.TileSize ;
			
			gp.obj[3] = new Document_Object();
			gp.obj[3].worldX = 14 * gp.TileSize;
			gp.obj[3].worldY = 2 * gp.TileSize ;
			
			gp.obj[4] = new Document_Object();
			gp.obj[4].worldX = 16 * gp.TileSize;
			gp.obj[4].worldY = 1 * gp.TileSize ;
			
			gp.obj[5] = new Document_Object();
			gp.obj[5].worldX = 24 * gp.TileSize;
			gp.obj[5].worldY = 11 * gp.TileSize ;
			
			
			break;
			
		case 4:
			
			gp.obj[0] = new Document_Object();
			gp.obj[0].worldX = 24 * gp.TileSize;
			gp.obj[0].worldY = 11 * gp.TileSize ;
		
			gp.obj[1] = new Document_Object();
			gp.obj[1].worldX = 0 * gp.TileSize;
			gp.obj[1].worldY = 4 * gp.TileSize ;
			
			gp.obj[2] = new Document_Object();
			gp.obj[2].worldX = 11 * gp.TileSize;
			gp.obj[2].worldY = 0 * gp.TileSize ;
			
			gp.obj[3] = new Document_Object();
			gp.obj[3].worldX = 16 * gp.TileSize;
			gp.obj[3].worldY = 5 * gp.TileSize ;
			
			gp.obj[4] = new Document_Object();
			gp.obj[4].worldX = 23 * gp.TileSize;
			gp.obj[4].worldY = 3 * gp.TileSize ;
			
			gp.obj[5] = new Document_Object();
			gp.obj[5].worldX = 16 * gp.TileSize;
			gp.obj[5].worldY = 6 * gp.TileSize ;
			
			
			break;
		}	
		}
	
	

	
}
