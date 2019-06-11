package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Block {

    private Color col; // imports the Color class privately.
    private DConsole d; // imports the DConsole class privately.
    int blockX; // create an int called blockX.
    int blockY; // create an int called blockY.

    public Block(DConsole d, int blockX, int blockY, Color col) { // Block method.
        this.blockX = 248; // what is the horiz. loc. of the block?
        this.blockY = 350; // what is the vert. loc. of the block?
        this.col = new Color(0, 0, 0); // Colour of the block.
        this.d = d; // What console are we using?
    }

    public void move() { // method that allows the block to move.
        for (int i = 0; i < 2; i++) { // constantly moves it down.
            blockY++; // makes the Y interval of the block constantly increase.
        }
        if (blockY >= 685) { // if the block is out of bounds, move it back in.
            for (int i = 0; i < 685; i++) {
                blockY--;
            }
        }
        if (blockY == 0) { // if it's out of bounds move it in.
            for (int i = 0; i < 685; i++) {
                blockY++;
            }
        }

    }

    public void draw() { // draws the block.
        this.d.setPaint(this.col);
        this.d.fillRect(this.blockX, this.blockY, 15, 15);
    }


}
