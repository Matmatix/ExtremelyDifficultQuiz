package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Q7 extends Question{


	//This is the spyro question


	private Game game;
	private Timer timer;

	public Q7(Game game, Timer timer){
		this.game = game;
		this.timer = timer;
	}

	public void render(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, (int)(Game.widthRatio *Game.WIDTH) + 20, (int)(Game.heightRatio *Game.HEIGHT) + 20);
		g.setColor(Color.white);
		g.fillOval((int)(Game.widthRatio*10), (int)(Game.heightRatio *10), (int)(Game.widthRatio *50), (int)(Game.heightRatio *50));
		g.setColor(Color.blue);
		Font fnt = new Font("arial black", 1, (int)(40*Math.min(Game.widthRatio, Game.heightRatio)));
		g.setFont(fnt);
		g.fillRect((int)(Game.widthRatio*100), (int)(Game.heightRatio*100), (int)(Game.widthRatio*1000), (int)(Game.heightRatio*100));
		g.setColor(Color.white);
		g.drawString("Hey Listen!", (int)(game.widthRatio*150), (int)(game.heightRatio*150));
		g.setColor(Color.blue);
		g.fillRect((int)(Game.widthRatio*100), (int)(Game.heightRatio*250), (int)(Game.widthRatio*800), (int)(Game.heightRatio*100));
		g.fillRect((int)(Game.widthRatio*100), (int)(Game.heightRatio*400), (int)(Game.widthRatio*800), (int)(Game.heightRatio*100));
		g.fillRect((int)(Game.widthRatio*100), (int)(Game.heightRatio*550), (int)(Game.widthRatio*800), (int)(Game.heightRatio*100));
		g.fillRect((int)(Game.widthRatio*100), (int)(Game.heightRatio*700), (int)(Game.widthRatio*800), (int)(Game.heightRatio*100));
		g.setColor(Color.white);
		g.drawString("Ok!", (int)(Game.widthRatio*120), (int)(Game.heightRatio*290));
		g.drawString("I'm not going to the Dungeon...", (int)(Game.widthRatio*120), (int)(Game.heightRatio*440));
		g.drawString("Shut up Navi!", (int)(Game.widthRatio*120), (int)(Game.heightRatio*590));
		g.drawString("Better than Midna", (int)(Game.widthRatio*120), (int)(Game.heightRatio*740));
		timer.render(g);
	}

	public void tick(){
		timer.tick();
		if (timer.getTime() == 0){
			game.state = Game.STATE.LOSE;
		}
	}

	public void start(){
		timer.restart();
	}
	
	public Game.STATE getState(){
		return Game.STATE.Q7;
	}
}
