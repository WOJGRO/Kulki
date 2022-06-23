package com.kulki.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.Timer;
import com.kulki.game.Kulki;

public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(final Kulki game) {
        super(game);


        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {
                game.setScreen(new GameScreen(game));
            }
        }, 1);
    }

    protected void init() {
        // TODO implement better assets loading when game grows
        splashImg = new Texture("Logo.png");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(1, 1, 0, 1);
        spriteBatch.begin();
        spriteBatch.draw(splashImg, 0, 0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        spriteBatch.end();

        Timer timer = new Timer(){

        };
    }



}
