package javaapplication1;

import DLibX.DConsole;

public class Collisions {

    Block b; // imports the Block class
    Ball bl; // imports the Ball class
    DConsole dc; // imports the console
    
    private int ballX; // creates an int
    private int ballY; // ""
    private int blockX; // ""
    private int blockY; // ""
    boolean sameLoc; // creates a boolean to determine if it's the same location or not
    int points = 0; // points int

    public void onCollide() {
        if (ballX == blockX && ballY == blockY) { // if it's at the same location
            sameLoc = true; // then sameLoc is true
        } else { // if it's not
            sameLoc = false; // then it's false
        }
        if(sameLoc == true){ // when it's true, add 50 points
            points += 25;
        }
    }
    

}
