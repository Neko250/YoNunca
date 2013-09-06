package com.github.neko250.yonunca.soundbanks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.*;
import com.github.neko250.yonunca.YoNunca;

public class Phrase {
	private Sound phrase;
	private String message;
	
	public Phrase(String path, String message) {
		phrase = YoNunca.assets.get(path, Sound.class);
		this.message = message;
	}
	
	public void play() {
		phrase.play(1.0f);
	}
	
	public void stop() {
		phrase.stop();
	}
	
	public void setPath(String path) {
		phrase = Gdx.audio.newSound(Gdx.files.internal(path));
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void dispose() {
		phrase.dispose();
	}
}
