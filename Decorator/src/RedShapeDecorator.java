public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);		
	}

	@Override
	public void draw() {  
		setRedBorder(decoratedShape);
		decoratedShape.draw();	     
	}

	private void setRedBorder(Shape decoratedShape){
		decoratedShape.setColor(255,0,0);
	}

	@Override
	public void setColor(int a, int b, int c) {
		// TODO Auto-generated method stub
		decoratedShape.setColor(a, b, c);
	}

	@Override
	public void setParams(int x, int y, int dim) {
		// TODO Auto-generated method stub
		decoratedShape.setParams(x,y,dim);
	}
}