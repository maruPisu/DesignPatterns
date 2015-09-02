import java.awt.Color;

public class Rectangle implements Shape {
	int x, y, l1, l2;
	Color color;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getL1() {
		return l1;
	}
	public int getL2() {
		return l2;
	}
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.addRectangle(this, color);
	}

	@Override
	public void insertParam(int... params) {
		// TODO Auto-generated method stub
		this.x = params[0];
		this.y = params[1];
		this.l1 = params[2];
		this.l2 = params[3];
		this.color = new Color(params[4],params[5],params[6]);
	}
}
