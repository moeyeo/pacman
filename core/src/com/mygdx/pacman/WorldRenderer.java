/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.pacman;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;


public class WorldRenderer {
    private PacmanGame pacmanGame;
    private Texture pacmanImg;
    private World world;
    private Pacman pacman;
    public SpriteBatch batch;
    private MazeRenderer mazeRenderer;
 
    
    public WorldRenderer(PacmanGame pacmanGame, World world) {
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
        this.world = world;
        mazeRenderer = new MazeRenderer(pacmanGame.batch,world.getMaze());
        pacmanImg = new Texture("pacman.png");
        pacman = world.getPacman();
    }
    public void render(float delta) {
        mazeRenderer.render();
        batch.begin();
        Vector2 pos = pacman.getPosition();
        batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
    }
}
