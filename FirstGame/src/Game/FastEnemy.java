package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy extends GameObject{

	private Handler handler;
	
	
	public FastEnemy(int x, int y, ID id , Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 2;
		velY = 10;
	}
	
	
	public Rectangle getBounds() {
		return new Rectangle(x, y , 16 ,16);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y<= 0 || y>= Game.HEIGHT - 16) velY *= -1;
		if(x<= 0 || x>= Game.WIDTH - 8) velX *= -1;
		
		handler.addObject(new BasicTrail(x, y , ID.Trail, Color.pink, 16 , 16, 0.05f , handler)); 

	}

	public void render(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(x, y, 10, 10);
	}

}
