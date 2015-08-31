
public class Circle extends Shape{
	int radius, x, y;
	
	public Circle(int radius, int x, int y, DrawAPI drawApi) {
		super(drawApi);
		this.radius = radius;
		this.x=x;
		this.y=y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	      this.drawApi.drawCircle(radius,x,y);
	}

	public int getRadius() {
		return radius;
	}
}
