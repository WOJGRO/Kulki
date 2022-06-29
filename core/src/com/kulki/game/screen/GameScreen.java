package com.kulki.game.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.kulki.game.Kulki;
import com.kulki.game.entities.Ball;
import com.kulki.game.entities.Ball2;
import com.kulki.game.entities.Menu;

public class GameScreen extends AbstractScreen{

    private Texture splashImg;
    private int x,y,x0,y0,a;
    private Label scoretext, score;
    Ball ball;

    Menu menu;

    public GameScreen(Kulki game) {
        super(game);

    }

    public void init() {
        // TODO implement better assets loading when game grows
        x=game.x;
        y=game.y;
        x0=(x-y)/3;
        y0=y/20;
        a=y-y0*2;

        initLabel();
        initBall(x0,y0,a/20,3,0,0);
        //initMeenu(x0+a,y0,x-a-x0,y);


    }

    private void initLabel() {

        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font = new BitmapFont();
        scoretext = new Label("Punkty", labelStyle);
        scoretext.setX(20);
        scoretext.setY(650);
        stage.addActor(scoretext);

        //stage.addActor(score);
    }



    private void initMeenu(int x0, int y0, int x, int y) {

        menu = new Menu(x0,y0,x,y);
        stage.addActor(menu);

    }


    private void updateBoard(int x0,int y0,int a) {


        stage.getBatch().begin();
        stage.getBatch().draw(new Texture(("Tło.jpg")),x0,y0,a,a);
        stage.getBatch().end();
        stage.act();
    }

    private void initBall(int x0,int y0,int r,int color,int x,int y) {
        System.out.println(x0);
        int xs = x0+r+x*r*2;
        System.out.println(xs);
        int ys = y0+r+(9-y)*r*2;
        ball=new Ball(xs,ys,r,1);
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
