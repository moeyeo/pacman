/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.pacman;
import com.badlogic.gdx.ScreenAdapter;
 
public class GameScreen extends ScreenAdapter {
    private PacmanGame pacmanGame;
 
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
    }
    
    @Override
    public void render(float delta) {
        System.out.println("Hello " + delta);
    }
}
