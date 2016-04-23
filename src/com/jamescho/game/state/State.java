package com.jamescho.game.state;

import android.view.MotionEvent;
import com.jamescho.framework.util.Painter;
import com.jamescho.simpleandroid.gdf.GameMainActivity;
import com.jamescho.simpleandroid.gdf.Assets;

public abstract class State {

	public void setCurrentState(State newState)
	{
		GameMainActivity.sGame.setCurrentState(newState);
	}
	
	public abstract void init();
	
	public abstract void update(float delta);
	
	public abstract void render(Painter g);
	
	public abstract boolean onTouch(MotionEvent e, int scaledX, int scaledY);
	
}
