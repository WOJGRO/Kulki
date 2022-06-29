package com.kulki.game.entities;

import com.badlogic.gdx.scenes.scene2d.Actor;

public class Ball2 extends Actor {

	private final static int WIDHT = 77;
	private final static int HEIGHT = 152;
	
	private final static int STARTING_X = 200;
	private final static int STARTING_Y = 300;
	
	public Ball2(){
		//super(new Texture("badlogic.jpg"));
		
		this.setOrigin(WIDHT / 2, HEIGHT / 2);
		this.setSize(WIDHT, HEIGHT);
		
		// starting position
		this.setPosition(STARTING_X, STARTING_Y);
	}



	
}