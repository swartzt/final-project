package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Ball {

    private Color col; // colour
    private DConsole d; // console
    private int locX; // horiz. loc
    private int locY; // vert. loc
    Block b; // imports the Block class.
    Collisions c; // imports the Collisions class

    public Ball(DConsole d, int locX, int locY, Color col) { // ball method.
        this.locX = 248; // locX
        this.locY = 350; // locY
        this.col = new Color(0, 0, 0); // colour of call.
        this.d = d; // console
    }

    public void move() { // creates a move method
        if (d.isKeyPressed('d')) { // when you press D do stuff
            if (locX >= 685) { // if it's out of bounds move it back in.
                for (int i = 0; i < 10; i++) { // creates a loop
                    locX--;
                }
            }
            for (int i = 0; i < 1; i++) { // move it to the right when you press D.
                locX++;
            }
        }
        if (d.isKeyPressed('a')) { // when you press A do stuff
            if (locX <= 0) { // if it's out of bounds
                for (int i = 0; i < 10; i++) { // moves it in by 10
                    locX++;
                    //changes the value of locY by 10.
                }
            }
            for (int i = 0; i < 1; i++) { // move it left when you press A.
                locX--;
            }
        }
    }

    public void draw() { // draw the ball.
        this.d.setPaint(this.col); // sets the paint colour
        this.d.fillEllipse(this.locX, this.locY, 50, 50); // draws the ellipse
    }
    
    
}
