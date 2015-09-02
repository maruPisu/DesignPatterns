import java.awt.Color;

public class RedCircle implements DrawAPI{

	Color color ;

	@Override
	public void drawCircle(int radius, int x, int y) {

		color = new Color(255,0,0);
		System.out.println("I'm a RED circle - (" + x + ", " + y + "), radius: " + radius + "");
		
		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.addCircle(new Circle(radius, x, y, this), color);
	}
	
}
