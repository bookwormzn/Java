package objects;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Document_Object extends Objects {
	
	public Document_Object()
	{
		this.name = "Document";
		
		try  { image = ImageIO.read(getClass().getResourceAsStream("/objects/Document.png")); }
		catch(IOException e) {e.printStackTrace();}
	}

}
