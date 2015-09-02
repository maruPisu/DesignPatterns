import java.awt.Color;

public class GreenCircle implements DrawAPI{

	Color color;
	@Override
	public void drawCircle(int radius, int x, int y) {
		color = new Color(0,255,0);
		System.out.println("I'm a GREEN circle - (" + x + ", " + y + "), radius: " + radius + "");

		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.addCircle(new Circle(radius, x, y, this), color);
	}
	
}
