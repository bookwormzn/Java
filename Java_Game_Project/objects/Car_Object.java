package objects;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Car_Object extends Objects {
	
	public Car_Object()
	{
		this.name = "Car";
		
		try  { image = ImageIO.read(getClass().getResourceAsStream("/objects/Car.png")); }
		catch(IOException e) {e.printStackTrace();}
		
        object_collision = true;
	}

}
