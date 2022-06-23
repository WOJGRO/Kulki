package com.kulki.game.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Ball extends Actor {

    private int x0,y0,r,color;

    public Ball(float x0,float y0,int r,int color){



        this.setOrigin(r,r);
        this.setSize(r,r);
        this.setPosition(x0,y0);
        this.x0= (int) x0;
        this.y0= (int) y0;
        this.r= (int) r;



    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        ShapeRenderer shapeRenderer = new ShapeRenderer();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(0, 1, 0, 1);
        shapeRenderer.circle(x0,y0,r);
        shapeRenderer.end();

       // System.out.println(this.hashCode());
    }
}
