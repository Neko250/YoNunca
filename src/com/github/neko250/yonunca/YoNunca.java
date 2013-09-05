package com.github.neko250.yonunca;

import com.github.neko250.yonunca.screens.*;
import com.github.neko250.yonunca.soundbanks.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.math.*;

public class YoNunca extends Game {
	public static final String VERSION = "0.0.1 Alpha";
	public static final String LOG = "Yo Nunca";
	public static final String NAME = "Yo Nunca";
	
	public static SoundBank sb;
	
	private Rectangle viewPort;
	
	@Override
	public void create() {
		sb = new SoundBank();
		viewPort = new Rectangle(0, 0, 320, 480);
		this.setScreen(new SplashScreen(this, viewPort));
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
	
	@Override
	public void pause() {
		super.pause();
	}
	
	@Override
	public void resume() {
		super.resume();
	}
}
