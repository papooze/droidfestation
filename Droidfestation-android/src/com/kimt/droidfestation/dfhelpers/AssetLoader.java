package com.kimt.droidfestation.dfhelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

	public class AssetLoader {

		public static Texture square, line, zig, zag, L, J, T, 
		blueDroid, cyanDroid, greenDroid, magDroid, orangeDroid, pinkDroid, yellowDroid;

		public static void load() {
			square = new Texture(Gdx.files.internal("assets/data/square.png"));
			line = new Texture(Gdx.files.internal("assets/data/line.png"));
			zig = new Texture(Gdx.files.internal("assets/data/zig.png"));
			zag = new Texture(Gdx.files.internal("assets/data/zag.png"));
			L = new Texture(Gdx.files.internal("assets/data/L.png"));
			J = new Texture(Gdx.files.internal("assets/data/J.png"));
			T = new Texture(Gdx.files.internal("assets/data/T.png"));
			blueDroid = new Texture(Gdx.files.internal("assets/data/blueDroid.gif"));
			cyanDroid = new Texture(Gdx.files.internal("assets/data/cyanDroid.gif"));
			greenDroid = new Texture(Gdx.files.internal("assets/data/greenDroid.gif"));
			magDroid = new Texture(Gdx.files.internal("assets/data/magDroid.gif"));
			orangeDroid = new Texture(Gdx.files.internal("assets/data/orangeDroid.gif"));
			pinkDroid = new Texture(Gdx.files.internal("assets/data/pinkDroid.gif"));
			yellowDroid = new Texture(Gdx.files.internal("assets/data/yellowDroid.gif"));
		}
}
