package Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyInput extends KeyAdapter
{
	
	private Handler handler;
	
	public keyInput(Handler handler)
	{
		this.handler = handler;
	}
	
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getID() ==  ID.Player)
			{
			/*	if(key == KeyEvent.VK_UP) tempObject.setY(tempObject.getY() - 1);
				if(key == KeyEvent.VK_DOWN) tempObject.setY(tempObject.getY() + 1);
				if(key == KeyEvent.VK_RIGHT) tempObject.setX(tempObject.getX() + 1);
				if(key == KeyEvent.VK_LEFT) tempObject.setX(tempObject.getX() - 1); */
				
				if(key == KeyEvent.VK_W) tempObject.setVelY(-5);
				if(key == KeyEvent.VK_S) tempObject.setVelY(5);
				if(key == KeyEvent.VK_D) tempObject.setVelX(5);
				if(key == KeyEvent.VK_A) tempObject.setVelX(-5);

				
				
			}
			
			
			if(key == KeyEvent.VK_ESCAPE) System.exit(1);
			
		}
	}
	
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getID() ==  ID.Player)
			{
			/*	if(key == KeyEvent.VK_UP) tempObject.setY(tempObject.getY() - 1);
				if(key == KeyEvent.VK_DOWN) tempObject.setY(tempObject.getY() + 1);
				if(key == KeyEvent.VK_RIGHT) tempObject.setX(tempObject.getX() + 1);
				if(key == KeyEvent.VK_LEFT) tempObject.setX(tempObject.getX() - 1); */
				
				if(key == KeyEvent.VK_W) tempObject.setVelY(0);
				if(key == KeyEvent.VK_S) tempObject.setVelY(0);
				if(key == KeyEvent.VK_D) tempObject.setVelX(0);
				if(key == KeyEvent.VK_A) tempObject.setVelX(0);


			}
			
			
		}
	}
}
