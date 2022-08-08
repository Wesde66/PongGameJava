import javax.swing.JFrame;   //Adding the GUI

public class Pong extends JFrame
{
	private final static String Window_Title = "Pong";
	private final static int Window_Width = 800;
	private final static int Window_Height = 600;
	
	public Pong()
	{
		setTitle(Window_Title);
		setSize(Window_Width, Window_Height);
		setResizable(false);
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
				{
					public void run() 
					{
						new Pong();
						
					}
				});
		

	}

}
