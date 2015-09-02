
public class FactoryDemo {

	public static void main(String[] args) {

		int nShapes = 10;
		int count = 0;
		
		Shape [] shapes = new Shape[nShapes];
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		TestFrame frame = TestFrame.getInstance();
		frame.init();

		shapes[count] = shapeFactory.getShape("CIRCLE");
		shapes[count++].insertParam(30,30,30,255,0,0);

		shapes[count] = shapeFactory.getShape("RECTANGLE");
		shapes[count++].insertParam(120,30,30,50,0,0,255);

		shapes[count] = shapeFactory.getShape("RECTANGLE");
		shapes[count++].insertParam(180,30,30,50,0,255,255);

		shapes[count] = shapeFactory.getShape("SQUARE");
		shapes[count++].insertParam(70,30,30,0,255,0);
		
		shapes[count] = shapeFactory.getShape("SQUARE");
		shapes[count++].insertParam(30,70,30,255,255,0);
		
		for(int i = 0 ; i < count; i++){
			shapes[i].draw();
		}
	}
}
