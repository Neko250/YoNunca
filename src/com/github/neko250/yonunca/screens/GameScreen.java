package com.github.neko250.yonunca.screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.Button.*;
import com.badlogic.gdx.scenes.scene2d.ui.Label.*;
import com.badlogic.gdx.utils.*;
import com.github.neko250.yonunca.*;
import com.github.neko250.yonunca.soundbanks.*;

public class GameScreen implements Screen {
	public YoNunca app;
	private static final String sub = "Coded By Neko250";
	
	private SoundBank sb;
	
	private Rectangle viewPort;
	private SpriteBatch batch;
	private Stage stage;
	private TextureAtlas atlas;
	private BitmapFont buttonsF, titleF, subtitleF;
	private Label title, subtitle, nextL, replayL, backL, message;
	private Button next, replay, back;
	private Skin skin;
	private Image wall, box;
	
	public GameScreen(YoNunca app, Rectangle viewPort) {
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
		sb = YoNunca.sb;
		sb = new SoundBank(YoNunca.assets);
		
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
		
		ButtonStyle butStyle = new ButtonStyle();
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
						- (titleF.getBounds(title.getText()).height / 2) + 25,
				titleF.getBounds(title.getText()).width,
				titleF.getBounds(title.getText()).height);
		
		subtitle = new Label(sub, subLabStyle);
		subtitle.setBounds(viewPort.getWidth() / 2
				- (subtitleF.getBounds(sub).width / 2), viewPort.getHeight()
				* 6 / 8 - (subtitleF.getBounds(sub).height / 2) + 45,
				subtitleF.getBounds(sub).width, subtitleF.getBounds(sub).height);
		
		nextL = new Label("Next", butLabStyle);
		nextL.setBounds(viewPort.getWidth() / 2
				- (buttonsF.getBounds("Next").width / 2) + 50,
				viewPort.getHeight() * 3 / 10
						- (buttonsF.getBounds("Next").height / 2) + 20,
				buttonsF.getBounds("Next").width,
				buttonsF.getBounds("Next").height);
		
		next = new Button(butStyle);
		next.setBounds(viewPort.getWidth() / 4 - (64 / 2), viewPort.getHeight()
				* 3 / 10 - (64 / 2) + 15, 64, 64);
		next.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return true;
			}
			
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				message.setText(sb.playNext());
			}
		});
		
		replayL = new Label("Replay", butLabStyle);
		replayL.setBounds(
				viewPort.getWidth() / 2
						- (buttonsF.getBounds("Replay").width / 2) + 50,
				viewPort.getHeight() * 2 / 10
						- (buttonsF.getBounds("Replay").height / 2) + 5,
				buttonsF.getBounds("Replay").width,
				buttonsF.getBounds("Replay").height);
		
		replay = new Button(butStyle);
		replay.setBounds(viewPort.getWidth() / 4 - (64 / 2),
				viewPort.getHeight() * 2 / 10 - (64 / 2), 64, 64);
		replay.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return true;
			}
			
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				message.setText(sb.replay());
			}
		});
		
		backL = new Label("Back", butLabStyle);
		backL.setBounds(viewPort.getWidth() / 2
				- (buttonsF.getBounds("Back").width / 2) + 50,
				viewPort.getHeight() * 1 / 10
						- (buttonsF.getBounds("Back").height / 2) - 10,
				buttonsF.getBounds("Back").width,
				buttonsF.getBounds("Back").height);
		
		back = new Button(butStyle);
		back.setBounds(viewPort.getWidth() / 4 - (64 / 2), viewPort.getHeight()
				* 1 / 10 - (64 / 2) - 15, 64, 64);
		back.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return true;
			}
			
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				app.setScreen(new MainMenuScreen(app, viewPort));
			}
		});
		
		wall = new Image(skin.getDrawable("wall"));
		wall.setBounds(0, 0, viewPort.getWidth(), viewPort.getHeight());
		box = new Image(skin.getDrawable("panel"));
		box.setBounds(20, 200, 280, 180);
		
		message = new Label("", subLabStyle);
		message.setWrap(true);
		message.setBounds(30, 210, 130, 170);
		
		stage.addActor(wall);
		stage.addActor(box);
		stage.addActor(message);
		stage.addActor(title);
		stage.addActor(subtitle);
		stage.addActor(next);
		stage.addActor(nextL);
		stage.addActor(replay);
		stage.addActor(replayL);
		stage.addActor(back);
		stage.addActor(backL);
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
		skin.dispose();
		stage.dispose();
		atlas.dispose();
	}
}
