package Game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 573860602378245302L;
	
	public Window(int width, int height, String title, Game game)
	{
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height)); // size window
		frame.setMaximumSize(new Dimension(width, height)); // max size window app 
		frame.setMinimumSize(new Dimension(width, height)); // min size windown app 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit button function
		frame.setResizable(false);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	
	}
	
	
}
