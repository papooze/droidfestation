package com.kimt.droidfestation;

import android.os.Bundle;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.kimt.droidfestation.dfhelpers.GridManager;
import com.kimt.droidfestation.dfhelpers.ShapeManager;

public class MainActivity extends AndroidApplication {
	
	private ShapeManager sm;
	private GridManager gm;
	public int x, y;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShapeManager sm = new ShapeManager();
        GridManager gm = new GridManager(sm);
        gm.getBlock(x, y);
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        initialize((ApplicationListener) new DFGame(), cfg);
        
    }
}