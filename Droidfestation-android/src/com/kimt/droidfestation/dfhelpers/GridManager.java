package com.kimt.droidfestation.dfhelpers;

import com.kimt.droidfestation.gameobjects.Blocks;

public class GridManager {
	
	ShapeManager sm;
	
	Blocks[][] grid = new Blocks[8][10];
	
	public GridManager (ShapeManager s) {
		sm = s;
	}
	
	public void set (Blocks b, int x1, int y1, int x2, int y2) {
		grid[x1][y1] = null;
		grid[x2][y2] = b;
	}
	
	public void init (Blocks b, int x, int y) {
		grid[x][y] = b;
	}
	
	public Blocks getBlock(int x, int y) {
		return grid[x][y];
	}
}