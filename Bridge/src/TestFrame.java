import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame{
	
	public static TestFrame instance = new TestFrame();
	
	Circle [] circles = new Circle[10];
	Color [] colors = new Color[10];
	int count = 0;
	
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
    	for(int i = 0; i< count; i++){
    		g.setColor(colors[i]);
    		g.fillOval(circles[i].x, circles[i].y, circles[i].getRadius(), circles[i].getRadius());
    	}
    }
    
    public void addCircle(Circle circle, Color color) {
    	circles[count] =circle;
    	colors[count++]=color;
    	this.repaint();
    }
}
