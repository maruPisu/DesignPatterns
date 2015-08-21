
public class SingleObject {

	//create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	int number;
	
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObject(){}
	
	public void setNumber(int num) {
		number = num;
	}

	//Get the only object available
	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("hello! my number is " + number);
	}
}
