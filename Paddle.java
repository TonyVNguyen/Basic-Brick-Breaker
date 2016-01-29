import java.awt.Color;
import java.awt.Graphics;


public class Paddle {
	private int x=0, y=0, val=0, val2=0, height=20,width=100 ;
	public boolean left = false;
	public boolean right = false;
	public Paddle(int someX, int someY){
		x = someX;
		y = someY;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public void move(){
		if (x<0){
			val=0;
			x=0;
		}
		if (x>500){
			val=0;
			x=500;
		}
		if(left)
			x-=3;
		if(right)
			x+=3;
//		x=x+val;
		
	
	}
	public void paint(Graphics pane)
	{
		
		
		pane.setColor(Color.RED);
		pane.fillRoundRect(x, y, width, height, 10, 20 );
		
	}
}
