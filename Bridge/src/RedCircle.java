
public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("I'm a RED circle - (" + x + ", " + y + "), radius: " + radius + "");
	}
	
}
