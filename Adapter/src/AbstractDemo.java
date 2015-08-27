
public class AbstractDemo {
	public static void main(String[] args) {
		
		TextShape textShape = new TextShape(50,50,90,90);
		
		Point[] box = textShape.BoundingBox();
		
		System.out.println("Bounding box: (" + box[0].x + ", " + box[0].y + "), (" + box[1].x + ", " + box[1].y+")");
	}
}
