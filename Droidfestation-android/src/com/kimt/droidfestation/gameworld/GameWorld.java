package com.kimt.droidfestation.gameworld;

import com.kimt.droidfestation.gameobjects.Blocks;
import com.kimt.droidfestation.gameobjects.Shape;

public class GameWorld {

	private Blocks blocks;
	private Shape s;
	private int score = 0;
	private int midPointY;
	private float runTime = 0;
	private GameRenderer renderer;
	private int x, y, c;
	

	public GameWorld(int midPointY) {
		this.midPointY = midPointY;
		s = new Shape();
		blocks = new Blocks(x, y, c, s);
	}

	public void update(float delta) {
		runTime += delta;
		}
		
	public void updateRunning(float delta) {
		if (delta > .15f) {
			delta = .15f;
		}

		blocks.update(delta);
		s.update(delta);
	}

	public Shape getShape() {
		return getShape();
	}

	public int getMidPointY() {
		return midPointY;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int increment) {
		score += increment;
	}

	public void start() {
	
	}

	public void ready() {
		
	}

	public void restart() {
		score = 0;
		ready();
	}

	public void setRenderer(GameRenderer renderer) {
		this.renderer = renderer;
	}
}
