
public class FloppyDisk implements Equipment{
	String _name;
	
	public FloppyDisk(String _name) {
		super();
		this._name = _name;
	}

	@Override
	public String get_name() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public int Power() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int NetPrice() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public void Add(Equipment equi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(Equipment equi) {
		// TODO Auto-generated method stub
		
	}

}
