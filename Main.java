package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        DConsole dc; // imports the DConsole class.
        dc = new DConsole(696, 564); // sets a new DConsole with the parameters of 696 and 564.
        dc.setTitle("World's crapiest game."); // names the Console.
        Ball b = new Ball(dc, 15, 15, Color.BLACK); // imports the Ball class.
        Block block = new Block(dc, 15, 15, Color.RED); // imports the Block class.
        Collisions c = new Collisions(); // imports the Collisions class

        while (true) { // while the game is running... do what?
            
            dc.clear(); // clears the screen
            
            dc.drawImage("background.png", 0, 0); // draws the background image.
            b.draw(); // imports the draw method so you can see the ball.
            b.move(); // imports the move method so you can move it.
            block.draw(); // imports the draw method from the block class.
            block.move(); // imports the move method from the block class so it moves.
            c.onCollide();
            dc.redraw(); //redraws the console
        }
    }

}
