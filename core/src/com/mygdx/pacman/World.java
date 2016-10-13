/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.pacman;

public class World {
    private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
 
    World(PacmanGame pacmanGame) {
        maze = new Maze();
        pacman = new Pacman(60,60,maze);
        this.pacmanGame = pacmanGame;
    }
 
    Pacman getPacman() {
        return pacman;
    }
    Maze getMaze() {
        return maze;
    }
    public void update(float delta) {
        pacman.update();
    }
}
