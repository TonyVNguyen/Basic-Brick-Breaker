import java.awt.Color;
import java.awt.Graphics;


public class Bricks {
	private int x,y;

	 private int width=70;

	 private int height=20;
	
	public boolean destroy=false;

	
	public Bricks(int X, int Y){
		this.x =X;
		this.y=Y;
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
	public void paint(Graphics pane)
	{
		
		
		pane.setColor(Color.WHITE);
		pane.fillRect(x, y, width, height);
		
	}
}
