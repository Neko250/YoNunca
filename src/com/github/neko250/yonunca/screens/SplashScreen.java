package com.github.neko250.yonunca.screens;

import aurelienribon.tweenengine.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.Input.*;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Scaling;
import com.github.neko250.yonunca.tween.*;
import com.github.neko250.yonunca.*;

public class SplashScreen implements Screen {
	
	private YoNunca app;
	
	private Rectangle viewPort;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private TextureAtlas atlas;
	private Sprite screen;
	private TweenManager manager;
	private Music music;
	
	public SplashScreen(YoNunca app, Rectangle viewPort) {
		this.app = app;
		this.viewPort = viewPort;
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glViewport((int) viewPort.getX(), (int) viewPort.getY(),
				(int) viewPort.getWidth(), (int) viewPort.getHeight());
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		screen.draw(batch);
		batch.end();
		
		manager.update(Gdx.graphics.getDeltaTime());
		camera.update();
		
		if (Gdx.input.isKeyPressed(Keys.ENTER)) {
			app.setScreen(new MainMenuScreen(app, viewPort));
		}
	}
	
	@Override
	public void resize(int width, int height) {
		Vector2 newVirtualRes = new Vector2(0f, 0f);
		Vector2 crop = new Vector2(width, height);
		
		newVirtualRes.set(Scaling.fit.apply(viewPort.getWidth(),
				viewPort.getHeight(), width, height));
		crop.sub(newVirtualRes);
		crop.scl(0.5f);
		
		viewPort = new Rectangle(crop.x, crop.y, newVirtualRes.x,
				newVirtualRes.y);
	}
	
	@Override
	public void show() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, viewPort.getWidth(), viewPort.getHeight());
		batch = new SpriteBatch();
		atlas = new TextureAtlas(Gdx.files.internal("img/textures.pack"));
		screen = atlas.createSprite("splash");
		screen.setBounds(0, 0, viewPort.getWidth(), viewPort.getHeight());
		screen.setColor(1, 1, 1, 0);
		music = Gdx.audio.newMusic(Gdx.files.internal("audio/splash.ogg"));
		
		Tween.registerAccessor(Sprite.class, new SpriteTween());
		
		manager = new TweenManager();
		
		TweenCallback cb = new TweenCallback() {
			@Override
			public void onEvent(int type, BaseTween<?> source) {
				tweenCompleted();
			}
		};
		
		Tween.to(screen, SpriteTween.ALPHA, 2).target(1)
				.ease(TweenEquations.easeInQuad).repeatYoyo(1, 3.5f)
				.setCallback(cb).setCallbackTriggers(TweenCallback.COMPLETE)
				.start(manager);
		
		music.play();
	}
	
	private void tweenCompleted() {
		app.setScreen(new MainMenuScreen(app, viewPort));
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
		music.dispose();
	}
}
