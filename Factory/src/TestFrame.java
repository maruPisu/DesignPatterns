import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame{
	
	public static TestFrame instance = new TestFrame();

	Circle [] circles = new Circle[10];
	Color [] Ccolors = new Color[10];
	Square [] squares = new Square[10];
	Color [] Scolors = new Color[10];
	Rectangle [] rectangles = new Rectangle[10];
	Color [] Rcolors = new Color[10];
	int circleCount = 0, squareCount = 0, rectangleCount = 0;
	
    public TestFrame(){ }
    
    public void init(){
         setSize(400,400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setVisible(true);
    }
    
	public static TestFrame getInstance(){
		return instance;
	}
    
    public void paint(Graphics g){
    	for(int i = 0; i< circleCount; i++){
    		g.setColor(Ccolors[i]);
    		g.fillOval(circles[i].getX(), circles[i].getY(), circles[i].getRadius(), circles[i].getRadius());
    	}
    	for(int i = 0; i< squareCount; i++){
    		g.setColor(Scolors[i]);
    		g.fillRect(squares[i].getX(), squares[i].getY(), squares[i].getSide(), squares[i].getSide());
    	}
    	for(int i = 0; i< rectangleCount; i++){
    		g.setColor(Rcolors[i]);
    		g.fillRect(rectangles[i].getX(), rectangles[i].getY(), rectangles[i].getL1(), rectangles[i].getL2());
    	}

    }

    public void addCircle(Circle circle, Color color) {
    	circles[circleCount] =circle;
    	Ccolors[circleCount++]=color;
    	this.repaint();
    }

    public void addSquare(Square square, Color color) {
    	squares[squareCount] =square;
    	Scolors[squareCount++]=color;
    	this.repaint();
    }
    
    public void addRectangle(Rectangle rectangle, Color color) {
    	rectangles[rectangleCount] =rectangle;
    	Rcolors[rectangleCount++]=color;
    	this.repaint();
    }
}
