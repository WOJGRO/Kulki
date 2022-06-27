package com.kulki.game.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class Menu extends Table {

    private Label scoretext,score;


    public Menu (int x0,int y0,int x,int y){
        this.right();
        this.setPosition(x0,y0);
        this.setSize(x,y);
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font= new BitmapFont();

        scoretext=new Label("Punkty: ",labelStyle);
        scoretext.setSize(300,300);
        scoretext.setFontScale(5);
        score=new Label("0",new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        score.setSize(100,100);
        this.add(scoretext).expandX().top();
        this.add(score).expandX().top();
    }

}
