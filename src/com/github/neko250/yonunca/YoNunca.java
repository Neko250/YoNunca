package com.github.neko250.yonunca;

import com.github.neko250.yonunca.screens.*;
import com.github.neko250.yonunca.soundbanks.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.*;

public class YoNunca extends Game {
	public static final String VERSION = "0.0.2 Alpha";
	public static final String LOG = "Yo Nunca";
	public static final String NAME = "Yo Nunca";
	
	public static AssetManager assets;
	public static SoundBank sb;
	
	private Rectangle viewPort;
	
	@Override
	public void create() {
		assets = new AssetManager();
		loadAssets();
		viewPort = new Rectangle(0, 0, 320, 480);
		this.setScreen(new LoadScreen(this, viewPort));
	}
	
	private void loadAssets() {
		assets.load("audio/splash.ogg", Sound.class);
		
		assets.load("audio/phrases/pablo/01_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/02_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/03_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/04_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/05_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/06_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/07_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/08_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/09_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/0A_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/0B_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/0C_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/0D_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/0E_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/0F_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/10_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/11_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/12_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/13_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/14_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/15_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/16_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/17_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/18_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/19_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/1A_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/1B_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/1C_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/1D_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/1E_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/1F_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/20_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/21_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/22_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/23_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/24_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/25_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/26_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/27_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/28_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/29_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/2A_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/2B_pablo.ogg", Sound.class);
		assets.load("audio/phrases/pablo/2C_pablo.ogg", Sound.class);
		
		assets.load("audio/phrases/mary/01_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/02_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/03_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/04_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/05_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/06_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/07_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/08_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/09_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/0A_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/0B_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/0C_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/0D_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/0E_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/0F_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/10_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/11_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/12_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/13_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/14_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/15_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/16_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/17_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/18_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/19_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/1A_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/1B_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/1C_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/1D_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/1E_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/1F_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/20_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/21_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/22_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/23_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/24_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/25_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/26_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/27_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/28_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/29_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/2A_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/2B_mary.ogg", Sound.class);
		assets.load("audio/phrases/mary/2C_mary.ogg", Sound.class);
		
		assets.load("audio/phrases/nano/01_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/02_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/03_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/04_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/05_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/06_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/07_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/08_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/09_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/0A_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/0B_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/0C_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/0D_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/0E_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/0F_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/10_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/11_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/12_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/13_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/14_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/15_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/16_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/17_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/18_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/19_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/1A_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/1B_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/1C_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/1D_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/1E_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/1F_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/20_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/21_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/22_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/23_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/24_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/25_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/26_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/27_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/28_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/29_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/2A_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/2B_nano.ogg", Sound.class);
		assets.load("audio/phrases/nano/2C_nano.ogg", Sound.class);
		
		assets.load("data/libgdx.png", Texture.class);
		
		assets.load("font/broadway.fnt", BitmapFont.class);
		assets.load("font/buttons.fnt", BitmapFont.class);
		assets.load("font/font_alt.fnt", BitmapFont.class);
		assets.load("font/font.fnt", BitmapFont.class);
		assets.load("font/subtitle.fnt", BitmapFont.class);
		assets.load("font/title.fnt", BitmapFont.class);
		
		assets.load("img/textures.pack", TextureAtlas.class);
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
