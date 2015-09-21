
public class DecoratorTest {

	public static void main(String[] args) {
	TestFrame frame = TestFrame.getInstance();
	frame.init();
		Shape circle = new Circle();
		circle.setParams(60, 60, 50);

		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.setParams(120, 60, 50);
		
		Shape redSquare = new RedShapeDecorator(new Square());
		redSquare.setParams(60, 120, 50);
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redSquare.draw();
	}
}
