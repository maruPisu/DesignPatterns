
public class TextShape extends TextView implements Shape{
	
	TextShape(int _x, int _y, int _width, int _height){
		super(_x, _y, _width, _height);
	}
	
	public Point[] BoundingBox(){
		Point[] points = new Point[2];
			
		points[0] = this.getOrigin();
		
		points[1] = new Point (	this.getOrigin().x + this.getWidth(), 
								this.getOrigin().y + this.getHeight());
		
		return points;
	}
}
