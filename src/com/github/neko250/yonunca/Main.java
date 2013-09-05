package com.github.neko250.yonunca;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Yo Nunca";
		cfg.useGL20 = true;
		cfg.fullscreen = true;
		cfg.width = 640;
		cfg.height = 480;
		cfg.x = -1;
		cfg.y = -1;
		cfg.resizable = false;
		
		new LwjglApplication(new YoNunca(), cfg);
	}
}
