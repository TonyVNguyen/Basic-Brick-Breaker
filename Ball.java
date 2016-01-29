import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;



public class Ball  {
	private int x = 30;
	private int y = 20;
	private final int RADIUS = 25;
	private double aX=2;
	private int aY=2;
	private Color color;
	
	public Ball(int someX, int someY){
		x = someX;
		y = someY;
		
	}
//	public void Collision (Bricks b){
//		Rectangle2D.Double self = new Rectangle2D.Double(x-BALL_RADIUS,y-BALL_RADIUS,BALL_RADIUS*2,BALL_RADIUS*2);
//		Rectangle2D.Double bricks = new Rectangle2D.Double(b.getX(),b.getY(),b.getWidth(),b.getHeight());
//		if(self.intersects(bricks)){
//			b.destroy=false;
//		}
		
	
	public void move(Paddle paddle){
		if(x<5)
			aX=1;
		if(x>=570)
			aX=-1;
		if(y<25)
			aY=1;
		if(y>=500){
			aX=0;
			aY=0;
		}
		x+=aX;
		y+=aY;
		//collision
		if(x+25> paddle.getX() && x < paddle.getX()+paddle.getWidth()){
			if(y+25>= paddle.getY() && y<= paddle.getY() +paddle.getHeight()){
				aY =-Math.abs(aY);
				double dist = x-(paddle.getX()+(paddle.getWidth()/2));
				aX= dist/10;
			}
//			Rectangle2D.Double self = new Rectangle2D.Double(x-BALL_RADIUS,y-BALL_RADIUS,BALL_RADIUS*2,BALL_RADIUS*2);
//			Rectangle2D.Double bricks = new Rectangle2D.Double(b.getX(),b.getY(),b.getWidth(),b.getHeight());
//			if(self.intersects(bricks)){
//				b.destroy=false;
//				
//				
//			}
		}
		
	}
	public void paint(Graphics pane)
	{
		
		
		pane.setColor(color.black);
		pane.fillOval((int)(x + 1), (int)(y + 1), (RADIUS - 1), (RADIUS - 1));
		
	}


	public void collision(Bricks b) {
		Rectangle2D.Double self = new Rectangle2D.Double(b.getX()-RADIUS,b.getY()-RADIUS,RADIUS*2,RADIUS*2);
		Rectangle2D.Double bricks = new Rectangle2D.Double(b.getX(),b.getY(),b.getWidth(),b.getHeight());
		if(self.intersects(bricks)){
			b.destroy=false;
			
			
		}
		
	}
}