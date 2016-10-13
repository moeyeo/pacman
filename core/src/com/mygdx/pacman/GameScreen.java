/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.pacman;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
 
public class GameScreen extends ScreenAdapter {
    /*private PacmanGame pacmanGame;
    private Texture pacmanImg;
    private Pacman pacman;*/
    PacmanGame pacmanGame;
    Pacman pacman;
    World world;
    WorldRenderer worldRenderer;
    
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        //pacmanImg = new Texture("pacman.png");
        world = new World(pacmanGame);
        pacman = world.getPacman();
 	worldRenderer = new WorldRenderer(pacmanGame,world);
    }
    @Override
    public void render(float delta) {
        update(delta);
 
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        worldRenderer.render(delta);
    }
    private void update(float delta) {
        updatePacmanDirection();
        world.update(delta);
    }
    public void updatePacmanDirection() {
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            pacman.setNextDirection(Pacman.DIRECTION_LEFT);
        }
        else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            pacman.setNextDirection(Pacman.DIRECTION_RIGHT);
        }
        else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            pacman.setNextDirection(Pacman.DIRECTION_DOWN);
        }
        else if(Gdx.input.isKeyPressed(Keys.UP)) {
            pacman.setNextDirection(Pacman.DIRECTION_UP);
        }
        else
            pacman.setNextDirection(Pacman.DIRECTION_STILL);
    }
}
