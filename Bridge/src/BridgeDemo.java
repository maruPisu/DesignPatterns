
public class BridgeDemo {

	public static void main(String[] args) {
		TestFrame thisFrame = TestFrame.getInstance();
		thisFrame.init();
		
		Circle redCircle   = new Circle(60, 20, 60, new RedCircle());
		Circle greenCircle = new Circle(60, 100, 60,  new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
