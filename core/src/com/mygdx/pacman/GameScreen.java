/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.pacman;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class GameScreen extends ScreenAdapter {
    private PacmanGame pacmanGame;
    private Texture pacmanImg;
    private int x;
    private int y;
    
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");
        x = 100;
        y = 100;
    }
    @Override
    public void render(float delta) {
        update(delta);
        SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        batch.draw(pacmanImg, x, y);
        batch.end();
    }
    private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += 10;
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            y -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            y += 10;
        }
    }
}
