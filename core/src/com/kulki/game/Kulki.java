package com.kulki.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.kulki.game.entities.Ball;
import com.kulki.game.screen.SplashScreen;

public class Kulki extends Game {

	Stage stage;
	Boolean paused;
	Ball[][] ballActors;
	int score=0;
	public static int x,y ;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public void create () {
		x= Gdx.graphics.getWidth();
		y= Gdx.graphics.getHeight();
		ballActors = new Ball[10][10];
		this.setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose () {

	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public Ball getBall(int x, int y) {
		Ball ball = this.ballActors[x][y];
		return ball;
	}

	public void setBallActors(int x, int y, Ball ball) {

		this.ballActors [x][y] = ball;
	}



}
