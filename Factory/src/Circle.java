import java.awt.Color;

public class Circle implements Shape {
	int x, y, radius;
	Color color;
	
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.addCircle(this, color);
	}

	public int getRadius(){
		return radius;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	@Override
	public void insertParam(int... params) {
		// TODO Auto-generated method stub
		this.x = params[0];
		this.y = params[1];
		this.radius = params[2];
		this.color = new Color(params[3],params[4],params[5]);
	}
}
