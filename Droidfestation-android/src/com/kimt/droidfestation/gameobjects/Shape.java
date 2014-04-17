package com.kimt.droidfestation.gameobjects;

import com.kimt.droidfestation.dfhelpers.ShapeManager;

import android.graphics.Color;
/*
 * Square CYAN
 * Line	PINK
 * Zig YELLOW
 * Zag GREEN
 * L MAGENTA
 * J BLUE
 * T ORANGE
 * 
 */

public class Shape {
	static int ORANGE = android.graphics.Color.rgb(255,165,0);
	static int PINK = android.graphics.Color.rgb(255,192,203);
	String s;
	ShapeManager sm;
	int orientation = (int)Math.random()*4;
	Blocks[] blocklist = new Blocks[4];
	int baseX;
	public Shape (ShapeManager m) {
		int baseX = (int)Math.random()*7;
		sm = m;
		switch (baseX) {
		case 1: s = "Square";
		case 2: s = "Line";
		case 3: s = "Zig";
		case 4: s = "Zag";
		case 5: s = "L";
		case 6: s = "J";
		case 7: s = "T";
		this.setBlocks();
		}
	}
	public Blocks[] getBlocks () {
		return blocklist;
	}
	protected void setBlocks() {

		if (s == "Square") {
			baseX = (int)Math.random()*6;
			blocklist[0] = new Blocks(baseX+1,-2,Color.CYAN,this);
			blocklist[1] = new Blocks(baseX+2,-2,Color.CYAN,this);
			blocklist[2] = new Blocks(baseX+1,-1,Color.CYAN,this);
			blocklist[3] = new Blocks(baseX+2,-1,Color.CYAN,this);
		}
		if (s == "Line") {
			if (orientation%2 == 0) {
				baseX = (int)Math.random()*3;
				blocklist[0] = new Blocks(baseX+1,-1,PINK,this);
				blocklist[1] = new Blocks(baseX+2,-1,PINK,this);
				blocklist[2] = new Blocks(baseX+3,-1,PINK,this);
				blocklist[3] = new Blocks(baseX+4,-1,PINK,this);
			}
			else {
				baseX = (int)Math.random()*6;
				blocklist[0] = new Blocks(baseX+1,-4,PINK,this);
				blocklist[1] = new Blocks(baseX+1,-3,PINK,this);
				blocklist[2] = new Blocks(baseX+1,-2,PINK,this);
				blocklist[3] = new Blocks(baseX+1,-1,PINK,this);
			}
		}
		if (s == "Zig") {
			if (orientation%2 == 0) {
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+1,-2,Color.YELLOW,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.YELLOW,this);
				blocklist[2] = new Blocks(baseX+2,-1,Color.YELLOW,this);
				blocklist[3] = new Blocks(baseX+3,-1,Color.YELLOW,this);
			}
			else {
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+2,-3,Color.YELLOW,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.YELLOW,this);
				blocklist[2] = new Blocks(baseX+1,-2,Color.YELLOW,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.YELLOW,this);
			}
		}
		if (s == "Zag") {
			if (orientation%2 == 0) {
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+1,-1,Color.GREEN,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.GREEN,this);
				blocklist[2] = new Blocks(baseX+2,-2,Color.GREEN,this);
				blocklist[3] = new Blocks(baseX+3,-2,Color.GREEN,this);
			}
			else {
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+1,-3,Color.GREEN,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.GREEN,this);
				blocklist[2] = new Blocks(baseX+2,-2,Color.GREEN,this);
				blocklist[3] = new Blocks(baseX+2,-1,Color.GREEN,this);
			}
		}
		if (s == "L") {
			switch(orientation) {
			case 0:
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+1,-1,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+3,-1,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+3,-2,Color.MAGENTA,this);
			case 1:
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+1,-3,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+1,-1,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+2,-1,Color.MAGENTA,this);
			case 2:
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+3,-2,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+1,-2,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.MAGENTA,this);
			case 3:
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+2,-1,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+2,-3,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+1,-3,Color.MAGENTA,this);
			}
		}
		if (s == "J") {
			switch(orientation) {
			case 0:
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+1,-2,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+3,-2,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+3,-1,Color.BLUE,this);
			case 1:
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+2,-3,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.BLUE,this);
			case 2:
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+3,-1,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+1,-1,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+1,-2,Color.BLUE,this);
			case 3:
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+1,-1,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+1,-3,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+2,-3,Color.BLUE,this);
			}
		}
		if (s == "T") {
			switch(orientation) {
			case 0:
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+1,-1,ORANGE,this);
				blocklist[1] = new Blocks(baseX+2,-1,ORANGE,this);
				blocklist[2] = new Blocks(baseX+2,-2,ORANGE,this);
				blocklist[3] = new Blocks(baseX+3,-1,ORANGE,this);
			case 1:
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+1,-3,ORANGE,this);
				blocklist[1] = new Blocks(baseX+1,-2,ORANGE,this);
				blocklist[2] = new Blocks(baseX+2,-2,ORANGE,this);
				blocklist[3] = new Blocks(baseX+1,-1,ORANGE,this);
			case 2:
				baseX = (int)Math.random()*4;
				blocklist[0] = new Blocks(baseX+3,-2,ORANGE,this);
				blocklist[1] = new Blocks(baseX+2,-2,ORANGE,this);
				blocklist[2] = new Blocks(baseX+2,-1,ORANGE,this);
				blocklist[3] = new Blocks(baseX+1,-2,ORANGE,this);
			case 3:
				baseX = (int)Math.random()*5;
				blocklist[0] = new Blocks(baseX+2,-1,ORANGE,this);
				blocklist[1] = new Blocks(baseX+2,-2,ORANGE,this);
				blocklist[2] = new Blocks(baseX+1,-2,ORANGE,this);
				blocklist[3] = new Blocks(baseX+2,-3,ORANGE,this);
			}
		}
	}
	public void setBlocks(int i, ShapeManager m) {
		orientation += i;
		if (s == "Square") {
			blocklist[0] = new Blocks(baseX+1,-2,Color.CYAN,this);
			blocklist[1] = new Blocks(baseX+2,-2,Color.CYAN,this);
			blocklist[2] = new Blocks(baseX+1,-1,Color.CYAN,this);
			blocklist[3] = new Blocks(baseX+2,-1,Color.CYAN,this);
		}
		if (s == "Line") {
			if (orientation%2 == 0) {
				blocklist[0] = new Blocks(baseX+1,-1,PINK,this);
				blocklist[1] = new Blocks(baseX+2,-1,PINK,this);
				blocklist[2] = new Blocks(baseX+3,-1,PINK,this);
				blocklist[3] = new Blocks(baseX+4,-1,PINK,this);
			}
			else {
				blocklist[0] = new Blocks(baseX+1,-4,PINK,this);
				blocklist[1] = new Blocks(baseX+1,-3,PINK,this);
				blocklist[2] = new Blocks(baseX+1,-2,PINK,this);
				blocklist[3] = new Blocks(baseX+1,-1,PINK,this);
			}
		}
		if (s == "Zig") {
			if (orientation%2 == 0) {
				blocklist[0] = new Blocks(baseX+1,-2,Color.YELLOW,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.YELLOW,this);
				blocklist[2] = new Blocks(baseX+2,-1,Color.YELLOW,this);
				blocklist[3] = new Blocks(baseX+3,-1,Color.YELLOW,this);
			}
			else {
				blocklist[0] = new Blocks(baseX+2,-3,Color.YELLOW,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.YELLOW,this);
				blocklist[2] = new Blocks(baseX+1,-2,Color.YELLOW,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.YELLOW,this);
			}
		}
		if (s == "Zag") {
			if (orientation%2 == 0) {
				blocklist[0] = new Blocks(baseX+1,-1,Color.GREEN,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.GREEN,this);
				blocklist[2] = new Blocks(baseX+2,-2,Color.GREEN,this);
				blocklist[3] = new Blocks(baseX+3,-2,Color.GREEN,this);
			}
			else {
				blocklist[0] = new Blocks(baseX+1,-3,Color.GREEN,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.GREEN,this);
				blocklist[2] = new Blocks(baseX+2,-2,Color.GREEN,this);
				blocklist[3] = new Blocks(baseX+2,-1,Color.GREEN,this);
			}
		}
		if (s == "L") {
			switch(orientation) {
			case 0:
				blocklist[0] = new Blocks(baseX+1,-1,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+3,-1,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+3,-2,Color.MAGENTA,this);
			case 1:
				blocklist[0] = new Blocks(baseX+1,-3,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+1,-1,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+2,-1,Color.MAGENTA,this);
			case 2:
				blocklist[0] = new Blocks(baseX+3,-2,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+1,-2,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.MAGENTA,this);
			case 3:
				blocklist[0] = new Blocks(baseX+2,-1,Color.MAGENTA,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.MAGENTA,this);
				blocklist[2] = new Blocks(baseX+2,-3,Color.MAGENTA,this);
				blocklist[3] = new Blocks(baseX+1,-3,Color.MAGENTA,this);
			}
		}
		if (s == "J") {
			switch(orientation) {
			case 0:
				blocklist[0] = new Blocks(baseX+1,-2,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+3,-2,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+3,-1,Color.BLUE,this);
			case 1:
				blocklist[0] = new Blocks(baseX+2,-3,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.BLUE,this);
			case 2:
				blocklist[0] = new Blocks(baseX+3,-1,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+1,-1,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+1,-2,Color.BLUE,this);
			case 3:
				blocklist[0] = new Blocks(baseX+1,-1,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+1,-3,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+2,-3,Color.BLUE,this);
			}
		}
		if (s == "T") {
			switch(orientation) {
			case 0:
				blocklist[0] = new Blocks(baseX+1,-1,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+3,-1,Color.BLUE,this);
			case 1:
				blocklist[0] = new Blocks(baseX+1,-3,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+1,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+1,-1,Color.BLUE,this);
			case 2:
				blocklist[0] = new Blocks(baseX+3,-2,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+1,-2,Color.BLUE,this);
			case 3:
				blocklist[0] = new Blocks(baseX+2,-1,Color.BLUE,this);
				blocklist[1] = new Blocks(baseX+2,-2,Color.BLUE,this);
				blocklist[2] = new Blocks(baseX+1,-2,Color.BLUE,this);
				blocklist[3] = new Blocks(baseX+2,-3,Color.BLUE,this);
			}
		}
		if (m.DetectCollision(this)) {
			if (i == 1) 
				setBlocks(-1,m);
		}
		else {
			setBlocks(1,m);
		}
		m.UpdateX();
	}
	public ShapeManager getManager () {
		return sm;
	}
	public void slide (int i) {
		baseX += i;
	}
}