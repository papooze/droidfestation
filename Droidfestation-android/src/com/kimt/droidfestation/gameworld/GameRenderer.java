package com.kimt.droidfestation.gameworld;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.kimt.droidfestation.dfhelpers.AssetLoader;
import com.kimt.droidfestation.gameobjects.Blocks;
import com.kimt.droidfestation.gameobjects.Shape;

public class GameRenderer {

		private OrthographicCamera cam;
		private ShapeRenderer shapeRenderer; 
		private SpriteBatch batcher; 
		private int midPointY;
		
		// Game Objects
		private Shape shape;
		private Blocks blocks;
		
		public GameRenderer() {
		
			cam = new OrthographicCamera();
			cam.setToOrtho(true, 136);
			
			batcher = new SpriteBatch();
			batcher.setProjectionMatrix(cam.combined);
			shapeRenderer = new ShapeRenderer();
			shapeRenderer.setProjectionMatrix(cam.combined);
			
			initAssets(); 
		}
		
		private void initAssets() {
			cyanDroid = AssetLoader.cyanDroid;
			greenDroid = AssetLoader.greenDroid;
			magDroid = AssetLoader.magDroid;
			orangeDroid = AssetLoader.orangeDroid;
			pinkDroid = AssetLoader.pinkDroid;
			yellowDroid = AssetLoader.yellowDroid;
			i = AssetLoader.i;
			j = AssetLoader.J;
			l = AssetLoader.L;
			line = AssetLoader.line;
			square = AssetLoader.square;
			zag = AssetLoader.zag;
			zig = AssetLoader.zig;
		}
		
		private void draw() {
			batcher.draw(shape);
			batcher.draw(grass, backGrass.getX(), backGrass.getY(),
					backGrass.getWidth(), backGrass.getHeight());
		}
		
		private void drawAndroid() {
			// Draw the grass
			batcher.draw(grass, frontGrass.getX(), frontGrass.getY(),
					frontGrass.getWidth(), frontGrass.getHeight());
			batcher.draw(grass, backGrass.getX(), backGrass.getY(),
					backGrass.getWidth(), backGrass.getHeight());
		}
	}

