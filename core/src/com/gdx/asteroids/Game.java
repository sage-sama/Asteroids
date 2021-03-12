package com.gdx.asteroids;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class Game implements ApplicationListener{

    public static int WIDTH;
    public static int HEIGHT;
    public static OrthographicCamera camera;

    @Override
    public void create() {
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();

        camera = new OrthographicCamera(WIDTH, HEIGHT);
        camera.translate(WIDTH/2, HEIGHT/2);
        camera.update();

        // Custom Input Processor
        Gdx.input.setInputProcessor(new GameInputProcessor());
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {
        // Clear screen to black
        Gdx.gl.glClearColor(0,0,0,1);

        if(GameKeys.isDown(GameKeys.SPACE)){
            System.out.println("SPACE");
        }
        GameKeys.update();

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
