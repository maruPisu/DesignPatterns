
public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("I'm a GREEN circle - (" + x + ", " + y + "), radius: " + radius + "");
	}
	
}
