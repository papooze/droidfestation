package com.kimt.droidfestation.gameobjects;

import android.graphics.Color;

public class Blocks {
	int color;
	int PosX;
	int PosY;
	Color jcolor;
	Shape shape;
	boolean android = false;
	
	public Blocks (int x, int y, int c, Shape s) {
		shape = s;
		PosX = x;
		PosY = y;
		s.getManager().getGridManager().init(this,x,y);
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
	
	public void set (int x, int y) {
		shape.getManager().getGridManager().set(this,PosX,PosY,x,y);
		PosX = x;
		PosY = y;
	}
	
	public Shape getShape () {
		return shape;
	}
	
	public int getColor () {
		return color;
	}
	
	public Color getjColor () {
		return jcolor;
	}
	
	public boolean getAndroid () {
		return android;		
	}
	
	public void setAndroid () {
		android = true;
	}
	
	public void setjColor (Color c) {
		jcolor = c;
	}
}