package com.kulki.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.kulki.game.entities.Ball;
import com.kulki.game.screen.SplashScreen;

public class Kulki extends Game {

	Stage stage;
	Boolean pause;
	Ball [][] ballActors;
	int score=0;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public void create () {
		ballActors = new Ball[10][10];
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

	public Ball getBall(int x, int y) {
		Ball ball = this.ballActors[x][y];
		return ball;
	}

	public void setBallActors(int x,int y,Ball ball) {
		this.ballActors [x][y] = ball;
	}



}
