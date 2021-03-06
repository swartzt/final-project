package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        DConsole dc  = new DConsole(696, 564); // sets a new DConsole with the parameters of 696 and 564
        dc.setTitle("Final Project // Pong"); // names the Console
        Ball b = new Ball(dc, 15, 15, Color.BLACK); // imports the Ball class
        Block block = new Block(dc, 15, 15, Color.RED); // imports the Block class
        Collisions c = new Collisions(block, b); // imports the Collisions class

        while (true) { // while the game is running... do what?
            
            dc.clear(); // clears the screen
            dc.setResizable(false);
            dc.drawImage("background.png", 0, 0); // draws the background image
            
            b.draw(); // imports the draw method so you can see the ball
            b.move(); // imports the move method so you can move it
            block.drawLeft(); // imports the drawLeft from the block class to draw the left paddle
            block.drawRight(); // draws the right paddle
            block.moveLeft(); // allows you to move the left paddle
            block.moveRight(); // move the right paddle
            
            c.onCollide(); // know when the ball collides
            dc.redraw(); //redraws the console
        }
    }

}