import java.awt.Color;

public class Circle implements Shape{
	private Color color = new Color(255,255,255);
	int x, y, radius;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.addCircle(this, color);
	}

	@Override
	public void setColor(int a, int b, int c) {
		// TODO Auto-generated method stub
		color = new Color(a,b,c);
	}

	@Override
	public void setParams(int _x, int _y, int _dim) {
		// TODO Auto-generated method stub
		x = _x;
		y = _y;
		radius = _dim;
	}
}
