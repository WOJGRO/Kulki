package com.kulki.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.kulki.game.Kulki;

public class GameScreen extends AbstractScreen {

    private Texture splashImg;
    private int x,y,x0,y0;

    public GameScreen(Kulki game) {
        super(game);
        init();
        x=Gdx.graphics.getWidth();
        y=Gdx.graphics.getHeight();
        x0=(x-y)/3;
        y0=y/20;


    }

    private void init() {
        // TODO implement better assets loading when game grows
        splashImg = new Texture("Tło.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(1, 1, 0, 1);
        spriteBatch.begin();
        spriteBatch.draw(splashImg, x0, y0,y-y0*2,y-y0*2);
        spriteBatch.end();
    }

}
