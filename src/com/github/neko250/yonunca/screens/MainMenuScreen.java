package com.github.neko250.yonunca.screens;

import com.github.neko250.yonunca.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.Label.*;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.*;
import com.badlogic.gdx.utils.*;

public class MainMenuScreen implements Screen {
	public YoNunca app;
	private static final String sub = "Coded By Neko250";
	
	private Rectangle viewPort;
	private Stage stage;
	private SpriteBatch batch;
	private TextureAtlas atlas;
	private Skin skin;
	private BitmapFont titleF, subtitleF, buttonsF;
	private TextButton play, quit;
	private Label title, subtitle;
	private Image mary;
	
	public MainMenuScreen(YoNunca app, Rectangle viewPort) {
		this.app = app;
		this.viewPort = viewPort;
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glViewport((int) viewPort.getX(), (int) viewPort.getY(),
				(int) viewPort.getWidth(), (int) viewPort.getHeight());
		
		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		stage.act(delta);
		
		batch.begin();
		stage.draw();
		batch.end();
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
		batch = new SpriteBatch();
		stage = new Stage(viewPort.getWidth(), viewPort.getHeight(), true);
		stage.clear();
		atlas = new TextureAtlas(Gdx.files.internal("img/textures.pack"));
		skin = new Skin();
		skin.addRegions(atlas);
		titleF = new BitmapFont(Gdx.files.internal("font/font.fnt"), false);
		subtitleF = new BitmapFont(Gdx.files.internal("font/font_alt.fnt"),
				false);
		subtitleF.setScale(0.5f);
		buttonsF = new BitmapFont(Gdx.files.internal("font/title.fnt"), false);
		buttonsF.setScale(0.5f);
		Gdx.input.setInputProcessor(stage);
		
		TextButtonStyle butStyle = new TextButtonStyle();
		butStyle.up = skin.getDrawable("button_up");
		butStyle.down = skin.getDrawable("button_down");
		butStyle.font = buttonsF;
		LabelStyle titleLabStyle = new LabelStyle();
		titleLabStyle.font = titleF;
		LabelStyle subLabStyle = new LabelStyle();
		subLabStyle.font = subtitleF;
		
		title = new Label(YoNunca.NAME, titleLabStyle);
		title.setBounds(
				viewPort.getWidth() / 2
						- (titleF.getBounds(title.getText()).width / 2),
				viewPort.getHeight() * 3 / 4
						- (titleF.getBounds(title.getText()).height / 2),
				titleF.getBounds(title.getText()).width,
				titleF.getBounds(title.getText()).height);
		
		subtitle = new Label(sub, subLabStyle);
		subtitle.setBounds(viewPort.getWidth() / 2
				- (subtitleF.getBounds(sub).width / 2), viewPort.getHeight()
				* 5 / 8 - (subtitleF.getBounds(sub).height / 2) + 20,
				subtitleF.getBounds(sub).width, subtitleF.getBounds(sub).height);
		
		play = new TextButton("Start !", butStyle);
		play.setBounds(viewPort.getWidth() / 2 - (200 / 2),
				viewPort.getHeight() / 2 - (40 / 2) - 10, 200, 40);
		play.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return true;
			}
			
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				app.setScreen(new GameScreen(app, viewPort));
			}
		});
		
		quit = new TextButton("Quit", butStyle);
		quit.setBounds(viewPort.getWidth() / 2 - (200 / 2),
				viewPort.getHeight() / 4 - (40 / 2) + 10, 200, 40);
		quit.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return true;
			}
			
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				Gdx.app.exit();
			}
		});
		
		mary = new Image(skin.getDrawable("mary_mid"));
		mary.setBounds(viewPort.getWidth() - 50, 2, 48, 48);
		
		stage.addActor(title);
		stage.addActor(subtitle);
		stage.addActor(play);
		stage.addActor(quit);
		stage.addActor(mary);
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
		
	}
}
