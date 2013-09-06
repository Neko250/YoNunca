package com.github.neko250.yonunca.screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.Label.*;
import com.badlogic.gdx.utils.*;
import com.github.neko250.yonunca.*;
import com.github.neko250.yonunca.util.LoadingBar;

public class LoadScreen implements Screen {
	public YoNunca app;
	private static final String msg = "Loading...";
	
	private Rectangle viewPort;
	private Stage stage;
	private SpriteBatch batch;
	private TextureAtlas atlas;
	private BitmapFont font;
	private Label message;
	
	private Image logo, loadingFrame, loadingBarHidden, screenBg, loadingBg,
			fix;
	private float startX, endX, percent;
	private Actor loadingBar;
	
	public LoadScreen(YoNunca app, Rectangle viewPort) {
		this.app = app;
		this.viewPort = viewPort;
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glViewport((int) viewPort.getX(), (int) viewPort.getY(),
				(int) viewPort.getWidth(), (int) viewPort.getHeight());
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		percent = Interpolation.linear.apply(percent,
				YoNunca.assets.getProgress(), 0.1f);
		
		loadingBarHidden.setX(startX + endX * percent);
		loadingBg.setX(loadingBarHidden.getX() + 15);
		loadingBg.setWidth(225 - (225 * percent));
		loadingBg.invalidate();
		
		stage.act();
		
		batch.begin();
		stage.draw();
		batch.end();
		
		if (YoNunca.assets.update()) {
			app.setScreen(new MainMenuScreen(app, viewPort));
		}
	}
	
	@Override
	public void resize(int width, int height) {
		width = 320;
		height = 480;
		stage.setViewport(width, height, false);
		screenBg.setSize(width, height);
		logo.setX((width - logo.getWidth()) / 2);
		logo.setY((height - logo.getHeight()) / 2 + 50);
		loadingFrame.setX((stage.getWidth() - loadingFrame.getWidth()) / 2);
		loadingFrame.setY((stage.getHeight() - loadingFrame.getHeight()) / 2);
		loadingBar.setX(loadingFrame.getX() + 8);
		loadingBar.setY(loadingFrame.getY() + 3);
		loadingBarHidden.setX(loadingBar.getX() + 40);
		loadingBarHidden.setY(loadingBar.getY() - 2);
		startX = loadingBarHidden.getX();
		endX = 220;
		loadingBg.setSize(225, 25);
		loadingBg.setX(loadingBarHidden.getX() + 15);
		loadingBg.setY(loadingBarHidden.getY() + 2);
		fix.setBounds(viewPort.getWidth() - 25, loadingBarHidden.getY() + 2,
				25, 25);
	}
	
	@Override
	public void show() {
		stage = new Stage(viewPort.getWidth(), viewPort.getHeight(), false);
		batch = new SpriteBatch();
		atlas = new TextureAtlas(Gdx.files.internal("img/loading.pack"));
		font = new BitmapFont(Gdx.files.internal("font/broadway.fnt"), false);
		
		logo = new Image(atlas.findRegion("libgdx-logo"));
		loadingFrame = new Image(atlas.findRegion("loading-frame"));
		loadingBarHidden = new Image(atlas.findRegion("loading-bar-hidden"));
		screenBg = new Image(atlas.findRegion("screen-bg"));
		loadingBg = new Image(atlas.findRegion("loading-frame-bg"));
		fix = new Image(atlas.findRegion("screen-bg"));
		
		Animation anim = new Animation(0.05f,
				atlas.findRegions("loading-bar-anim"));
		anim.setPlayMode(Animation.LOOP_REVERSED);
		loadingBar = new LoadingBar(anim);
		
		LabelStyle labStyle = new LabelStyle();
		labStyle.font = font;
		
		message = new Label(msg, labStyle);
		message.setBounds(viewPort.getWidth() / 2
				- (font.getBounds(msg).width / 2), viewPort.getHeight() * 3 / 8
				- (font.getBounds(msg).height / 2), font.getBounds(msg).width,
				font.getBounds(msg).height);
		
		stage.addActor(screenBg);
		stage.addActor(loadingBar);
		stage.addActor(loadingBg);
		stage.addActor(loadingBarHidden);
		stage.addActor(fix);
		stage.addActor(loadingFrame);
		stage.addActor(logo);
		stage.addActor(message);
	}
	
	@Override
	public void hide() {
		
	}
	
	@Override
	public void pause() {
		
	}
	
	@Override
	public void resume() {
		
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		atlas.dispose();
	}
}
