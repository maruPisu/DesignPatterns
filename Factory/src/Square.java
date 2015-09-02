import java.awt.Color;

public class Square implements Shape {
	int x, y, side;
	Color color;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSide() {
		return side;
	}
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.addSquare(this, color);
	}

	@Override
	public void insertParam(int... params) {
		// TODO Auto-generated method stub
		this.x = params[0];
		this.y = params[1];
		this.side = params[2];
		this.color = new Color(params[3],params[4],params[5]);
	}
}
