package com.kimt.droidfestation.dfhelpers;

import java.util.ArrayList;

import com.kimt.droidfestation.gameobjects.Shape;

public class ShapeManager {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	GridManager gm;
	public ShapeManager() {

	}
	protected void setgManager (GridManager g) {
		gm = g;
	}
	public GridManager getGridManager () {
		return gm;
	}
	public void addShape() {
		shapes.add(new Shape(this));
	}

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public boolean delShape(Shape s) {
		return shapes.remove(s);
	}

	public void UpdateX() {
		//TODO Some method to redraw blocks
	}

	public void UpdateY() {
		for (int i = shapes.size(); i > 0; i--) {
			for (int j = 0; j <= 3; j++) {
				shapes.get(i).getBlocks()[j].set(shapes.get(i).getBlocks()[j].getX()+1,shapes.get(i).getBlocks()[j].getY());
			}
		}
		//TODO Some method to redraw blocks
	}

	public boolean DetectCollision(Shape s) {
		for (int i = shapes.size(); i > 0; i--) {
			if (shapes.indexOf(s) == i) i--;
			for (int j = 0; j <= 3; j++) {
				for (int k = 0; k <= 3; k++) {
					if (shapes.get(i).getBlocks()[j].getX() == s.getBlocks()[k].getX() && shapes.get(i).getBlocks()[j].getY() == s.getBlocks()[k].getY()) return false;
				}
			}
		}
		return false;
	}

}
