
public class FactoryDemo {

	public static void main(String[] args) {

		String Shapes[] = {"CIRCLE", "RECTANGLE", "SQUARE"};

		ShapeFactory shapeFactory = new ShapeFactory();
		
		for(int i = 0; i < 3; i++) {
			//get an object of Shapes[i] and call its draw method.
			Shape shape1 = shapeFactory.getShape(Shapes[i]);

			//call draw method of Shape
			shape1.draw();
		}
	}
}
