package objects;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Key_Object extends Objects {
	
	public Key_Object()
	{
		this.name = "Key";
		
		try  { image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png")); }
		catch(IOException e) {e.printStackTrace();}
	}

}
