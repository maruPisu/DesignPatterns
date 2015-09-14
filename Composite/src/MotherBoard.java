
public class MotherBoard extends CompositeElement{

	public MotherBoard(String _name) {
		super(_name);
	}

	@Override
	public int Power() {
		int power = 25;
		return power + super.Power();
	}

	@Override
	public int NetPrice() {
		int price = 80;		
		return price + super.NetPrice(); 
	}
}
