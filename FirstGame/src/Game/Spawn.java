package Game;

import java.util.Random;

public class Spawn 
{
	private Handler handler;
	
	private HUD hud;
	private int scoreKeep = 0;
	
	private Random r = new Random();
	public Spawn(Handler handler, HUD hud)
	{
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick()
	{
		scoreKeep++;
		
		if(scoreKeep >= 100)
		{
			scoreKeep = 0;
			hud.setLevel(hud.getLevel()+1);
			
			
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH),r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.FastEnemy, handler));
		}
	}
}
