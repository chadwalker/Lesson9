package com.jamescho.game.state;

import android.view.MotionEvent;

import com.jamescho.framework.util.Painter;
import com.jamescho.simpleandroid.gdf.Assets;

public class MenuState extends State {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Painter g) {
		g.drawImage(Assets.welcome, 0, 0);
		
	}

	@Override
	public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
		// TODO Auto-generated method stub
		return false;
	}

}
