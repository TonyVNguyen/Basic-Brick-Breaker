import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.util.*;
/**
 * @ tommy muth
 *The Game class helps with 
 *the functionality of the game and cards
 *and buttons
 */
public class Game extends Frame implements KeyListener, ActionListener  {
	/**
	 * 
	 */
	// Datamembers
	
	Timer tm = new Timer(5, this);
	
	private UneFenetre myWindow;                   //Calls UneFenetre class 
	
	Ball ball = new Ball(300, 400);
	Paddle paddle = new Paddle(250,400);

	private  ArrayList<Bricks> bricks = new ArrayList<Bricks>();
	private String level[] = {"........................",
							 ".........................",
							 "........................",
							 ".........................",
							 ".........................",
							 "....b..........b........",
							 "........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 "...b......b......b..........",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							 ".........................",
							};
	public Game(){
		tm.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		setTitle("BrickBreaker");// the frame
		setSize(600, 500);             // and its
		setLocation(150,150);	       //characteristics
		setBackground(new Color(100,50,100));
		
		
		
		myWindow = new UneFenetre();//closes the window
		addWindowListener(myWindow);
		setVisible(true);
	}

			
		
	
	public void paint(Graphics pane)
	{	
		paddle.paint(pane);
		ball.paint(pane);
		
		
		for (int y =0; y< level.length; y++){
			for (int x =0; x< level[y].length(); x++){
				if(level[y].charAt(x)=='b')
				bricks.add(new Bricks(x*16,y*16));}
		for( Bricks b : bricks){
			b.paint(pane);
			
		}

//		pane.setColor(Color.RED);
//		pane.fillRect(x, y+400, 70, 20 );
		tm.start();
		repaint();
		 /* Bottom corner font
		 */
//		Graphics2D pane2 = (Graphics2D) pane;
//		pane2.setColor(Color.BLUE);
//	    
//		
//	    pane2.setFont(new Font("monospace", Font.ITALIC | Font.BOLD, 51));
//		pane2.drawString("Brick Breaker", 23,480);
//		
//		Graphics2D pane3 = (Graphics2D) pane;
//		
//		pane3.setColor(new Color(105,0,200));
//		
//	    pane3.setFont(new Font("monospace", Font.ITALIC | Font.BOLD, 50));
//		pane3.drawString("Brick Breaker", 30,480);
//		
		//pane.setColor(Color.BLUE);
		}
	}
	
	

	
		public void actionPerformed(ActionEvent e) {

		paddle.move();
		ball.move(paddle);
		
		for(int i =0; i < bricks.size(); i++){
			
			ball.collision(bricks.get(i));
			if(!bricks.get(i).destroy)
			{
				bricks.remove(i);
			}
		}
		repaint();
			
		}	
	
	public void keyPressed(KeyEvent e) {
		 
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
		 paddle.left =true;
		 
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){

			
			paddle.right=true;
		}
		
	}
	
	public void keyReleased(KeyEvent e) {
		 
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
			 paddle.left =false;
			 
			}
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				paddle.right=false;
			}
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
//	
//	
	/**
	 * Draws the two Decks
	 */

	/**
	 * Setup the game.
	 */

	/**
	 * Finds the winner
	 */

	/**
	 *Draws the objects 
	 */
//	public void paint(Graphics pane){
//		
////		
//	    pane.setColor(Color.BLUE);
//		paddle.draw(pane);
//		
//		tm.start();
//		/**
//		 * Bottom corner font
//		 */
//		Graphics2D pane2 = (Graphics2D) pane;
//		pane2.setColor(Color.BLACK);
//	    
//		
//	    pane2.setFont(new Font("monospace", Font.ITALIC | Font.BOLD, 51));
//		pane2.drawString("Brick Breaker", 23,480);
//		
//		Graphics2D pane3 = (Graphics2D) pane;
//		
//		pane3.setColor(new Color(255,150,30));
//		
//	    pane3.setFont(new Font("monospace", Font.ITALIC | Font.BOLD, 50));
//		pane3.drawString("Brick Breaker", 30,480);
//		
//		pane.setColor(Color.BLUE);
//		paddle.draw(pane);

		}

	
	
	
	
	//end Game class
