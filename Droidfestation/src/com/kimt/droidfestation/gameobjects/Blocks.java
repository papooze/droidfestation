package com.kimt.droidfestation.gameobjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.physics.box2d.Shape;

//import android.graphics.color; 

public class Blocks {
	Color color;
	int PosX;
	int PosY;
	Color jcolor;
	Shape shape;
	public Blocks (int x, int y, Color c, Shape s) {
		shape = s;
		PosX = x;
		PosY = y;
		color = c;
		this.genColor();
	}
	protected void genColor() {
		int i = (int)Math.random()*6;
		switch (i) {
		case 0: color = Color.GREEN;
		case 1: color = Color.BLUE;
		case 2: color = Color.RED;
		case 3: color = Color.MAGENTA;
		case 4: color = Color.YELLOW;
		case 5: color = Color.CYAN;		
		}
	}
	public int getX () {
		return PosX;
	}
	public int getY () {
		return PosY;
	}
	public Shape getShape () {
		return shape;
	}
	public Color getColor () {
		return color;
	}
	public Color getjColor () {
		return jcolor;
	}
}
