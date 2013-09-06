package com.github.neko250.yonunca.screens;

import com.github.neko250.yonunca.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.Button.*;
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
	private Button play, quit;
	private Label title, subtitle, playL, quitL;
	private Image wall;
	
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
		stage = new Stage(viewPort.getWidth(), viewPort.getHeight(), false);
		stage.clear();
		atlas = YoNunca.assets.get("img/textures.pack", TextureAtlas.class);
		skin = new Skin();
		skin.addRegions(atlas);
		titleF = YoNunca.assets.get("font/title.fnt", BitmapFont.class);
		subtitleF = YoNunca.assets.get("font/subtitle.fnt", BitmapFont.class);
		subtitleF.setScale(0.5f);
		buttonsF = YoNunca.assets.get("font/buttons.fnt", BitmapFont.class);
		buttonsF.setScale(0.75f);
		Gdx.input.setInputProcessor(stage);
		
		ButtonStyle butStyle = new TextButtonStyle();
		butStyle.up = skin.getDrawable("but_up");
		butStyle.down = skin.getDrawable("but_down");
		LabelStyle titleLabStyle = new LabelStyle();
		titleLabStyle.font = titleF;
		LabelStyle subLabStyle = new LabelStyle();
		subLabStyle.font = subtitleF;
		LabelStyle butLabStyle = new LabelStyle();
		butLabStyle.font = buttonsF;
		
		title = new Label(YoNunca.NAME, titleLabStyle);
		title.setBounds(
				viewPort.getWidth() / 2
						- (titleF.getBounds(title.getText()).width / 2),
				viewPort.getHeight() * 7 / 8
						- (titleF.getBounds(title.getText()).height / 2),
				titleF.getBounds(title.getText()).width,
				titleF.getBounds(title.getText()).height);
		
		subtitle = new Label(sub, subLabStyle);
		subtitle.setBounds(viewPort.getWidth() / 2
				- (subtitleF.getBounds(sub).width / 2), viewPort.getHeight()
				* 6 / 8 - (subtitleF.getBounds(sub).height / 2) + 20,
				subtitleF.getBounds(sub).width, subtitleF.getBounds(sub).height);
		
		playL = new Label("Play !", butLabStyle);
		playL.setBounds(viewPort.getWidth() / 2
				- (buttonsF.getBounds("Play !").width / 2) + 45,
				viewPort.getHeight() / 2
						- (buttonsF.getBounds("Play !").height / 2) - 45,
				buttonsF.getBounds("Play !").width,
				buttonsF.getBounds("Play !").height);
		
		play = new Button(butStyle);
		play.setBounds(viewPort.getWidth() / 4 - (64 / 2), viewPort.getHeight()
				/ 2 - (64 / 2) - 50, 64, 64);
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
		
		quitL = new Label("Quit", butLabStyle);
		quitL.setBounds(viewPort.getWidth() / 2
				- (buttonsF.getBounds("Quit").width / 2) + 35,
				viewPort.getHeight() / 4
						- (buttonsF.getBounds("Quit").height / 2) + 5,
				buttonsF.getBounds("Quit").width,
				buttonsF.getBounds("Quit").height);
		
		quit = new Button(butStyle);
		quit.setBounds(viewPort.getWidth() / 4 - (64 / 2), viewPort.getHeight()
				/ 4 - (64 / 2), 64, 64);
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
		
		wall = new Image(skin.getDrawable("wall"));
		wall.setBounds(0, 0, viewPort.getWidth(), viewPort.getHeight());
		
		stage.addActor(wall);
		stage.addActor(title);
		stage.addActor(subtitle);
		stage.addActor(play);
		stage.addActor(playL);
		stage.addActor(quit);
		stage.addActor(quitL);
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
		stage.dispose();
		batch.dispose();
		atlas.dispose();
		skin.dispose();
	}
}
