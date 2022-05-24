package com.kulki.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.kulki.game.screen.SplashScreen;

public class Kulki extends Game {

	Stage stage;
	Boolean pause;

	@Override
	public void create () {

		this.setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose () {

	}

	public Boolean getPause() {
		return pause;
	}

	public void setPause(Boolean pause) {
		this.pause = pause;
	}

}