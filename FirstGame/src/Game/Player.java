package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{

	Random r = new Random();
	
	Handler handler;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
	}
	
	
	public Rectangle getBounds()
	{
		return new Rectangle(x ,y ,32,32);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		
		x = Game.clamp(x, 0 , Game.WIDTH - 16);
		y = Game.clamp(y, 0 , Game.HEIGHT - 39);
		
		handler.addObject(new BasicTrail(x, y , ID.Trail, Color.blue, 16 , 16, 0.05f , handler)); 

		
		collision();
	}
	
	private void collision()
	{
		for(int i=0; i < handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getID() == ID.BasicEnemy || tempObject.getID() == ID.FastEnemy)
			{
				if(getBounds().intersects(tempObject.getBounds()))
				{
					HUD.HEALTH -= 2;
				}


			}
		}
	}
	
	public void render(Graphics g)
	{
		/*Graphics2D g2d = (Graphics2D) g;*/
		
		g.setColor(Color.orange);
		g.fillRect(x, y, 10, 10);
		
	}

}
