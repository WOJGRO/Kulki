package com.kulki.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.kulki.game.Kulki;
import com.kulki.game.entities.Ball;

public class GameScreen extends AbstractScreen {

    private Texture splashImg;
    private int x,y,x0,y0,a;

    Ball ball;

    public GameScreen(Kulki game) {
        super(game);

    }

    public void init() {
        // TODO implement better assets loading when game grows
        x=Gdx.graphics.getWidth();
        y=Gdx.graphics.getHeight();
        x0=(x-y)/3;
        y0=y/20;
        a=y-y0*2;


        initBall(x0,y0,a/20,3,0,0);

    }
    private void updateBoard(int x0,int y0,int a) {


        stage.getBatch().begin();
        stage.getBatch().draw(new Texture("Tło.jpg"),x0,y0,a,a);
        stage.getBatch().end();
        stage.act();


    }

    private void initBall(int x0,int y0,int r,int color,int x,int y) {
        System.out.println(x0);
        int xs = x0+r+x*r*2;
        System.out.println(xs);
        int ys = y0+r+(9-y)*r*2;
        ball=new Ball(xs,ys,r,color);
        game.setBallActors(x,y,ball);
        stage.addActor(ball);

    }


    @Override
    public void render(float delta) {
        super.render(delta);
        update();

        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    private void update() {
        updateBoard(x0,y0,a);

    }

}
