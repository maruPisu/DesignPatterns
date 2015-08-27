
public class TextView {
	int _x;
	int _y;
	int _width;
	int _height;
	
	public TextView(int _x, int _y, int _width, int _height) {
		super();
		this._x = _x;
		this._y = _y;
		this._width = _width;
		this._height = _height;
	}
	
    Point getOrigin(){
    	return new Point(_x,_y);
    }

    int getWidth(){
    	return _width;
    }
    
    int getHeight(){
    	return _height;    	
    }
    
    Boolean IsEmpty(){
    	return true;
    };
}
