import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class PongPanel extends JPanel implements ActionListener, KeyListener
{
	private final static Color Background_Color = Color.BLACK; 
	private final static int TIMER_DELAY = 5;
	
	boolean gameInitialised = false;
	Ball ball;
	
	public void createObjects()
	{
		ball = new Ball(getWidth(), getHeight());
	}
	
	public PongPanel()
	{
		setBackground(Background_Color);
		Timer timer = new Timer(TIMER_DELAY, this);
		timer.start();
	}
	
	private void update ()
	{
		if (!gameInitialised)
		{
			createObjects();
			gameInitialised = true;
		}
	}
	
	private void paintSprite(Graphics g, Sprite sprite)
	{
		g.setColor(sprite.getColour());
		g.fillRect(sprite.getXPosition(), sprite.getYPosition(), sprite.getWidth(), sprite.getHeight());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		paintDottedLine(g);
		
		if (gameInitialised)
		{
			paintSprite(g, ball);
		}

	}
	
	public void paintDottedLine(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g.create();
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[ ]{9}, 0);
		g2d.setStroke(dashed);
		g2d.setPaint(Color.WHITE);
		g2d.drawLine(getWidth()/ 2, 0, getWidth()/ 2, getHeight());
		g2d.dispose();
	}

	@Override
	public void keyTyped(KeyEvent event)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent event) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		update();
		repaint();
		
	}
	

}
