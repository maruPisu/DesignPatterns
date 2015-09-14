import java.util.ArrayList;

public class CompositeElement implements Equipment{
	String _name;
	ArrayList<Equipment> _components;
	
	public CompositeElement(String _name) {
		this._name = _name;
		_components = new ArrayList<Equipment>();
	}
	
	@Override
	public String get_name() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public int Power() {
		int sum = 0;
		
		for(Equipment e : _components){
			int part = e.Power();
			sum += part;
		}
		
		return sum; 
	}

	@Override
	public int NetPrice() {
		int sum = 0;
		
		for(Equipment e : _components){
			int part = e.NetPrice();
			sum += part;
		}
		
		return sum; 
	}
	@Override
	public void Add(Equipment equi) {

		_components.add(equi);
	}

	@Override
	public void Remove(Equipment equi) {

		_components.remove(equi);
	}

}
