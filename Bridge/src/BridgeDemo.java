
public class BridgeDemo {

	public static void main(String[] args) {
		Circle redCircle   = new Circle(0, 0, 20, new RedCircle());
		Circle greenCircle = new Circle(1, 1, 2,  new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
