import java.util.Random;

public class SingletonDemo {
	public static void main(String[] args) {

	    Random rand = new Random();
		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();

		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		object.setNumber(rand.nextInt(100));
		
		//Get the only object available
		SingleObject object2 = SingleObject.getInstance();

		//show the message
		object.showMessage();
		object2.showMessage();
	}

}
