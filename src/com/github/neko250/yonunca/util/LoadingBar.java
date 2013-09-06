package com.github.neko250.yonunca.util;

import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.*;

/**
 * @author Mats Svensson
 */
public class LoadingBar extends Actor {
	
	Animation animation;
	TextureRegion reg;
	float stateTime;
	
	public LoadingBar(Animation animation) {
		this.animation = animation;
		reg = animation.getKeyFrame(0);
	}
	
	@Override
	public void act(float delta) {
		stateTime += delta;
		reg = animation.getKeyFrame(stateTime);
	}
	
	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw(reg, getX(), getY());
	}
}
