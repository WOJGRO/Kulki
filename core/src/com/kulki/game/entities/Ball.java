package com.kulki.game.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Ball extends Actor {

    private int x0,y0,r,color;
    private Color colorBall;
    public Ball(float x0, float y0, int r, int color){

        this.setOrigin(r/2,r/2);
        this.setSize(r,r);
        this.setPosition(x0,y0);
        this.x0= (int) x0;
        this.y0= (int) y0;
        this.r= (int) r;

        colorBall= choseColor(color);

    }

    private Color choseColor(int color) {

        Color choseColor;
        if (color==1) {
            choseColor= Color.RED;
        } else
        if (color==2) {
            choseColor= Color.GREEN;
        } else
        if (color==3){
            choseColor= Color.BLUE;
        } else
        {
            choseColor = Color.BLACK;
        }

        return choseColor;

    }
	/*
    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        ShapeRenderer shapeRenderer = new ShapeRenderer();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(colorBall);
        shapeRenderer.circle(x0,y0,r);
        shapeRenderer.end();


    }*/
}
