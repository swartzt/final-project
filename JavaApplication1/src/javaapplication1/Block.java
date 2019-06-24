package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Block {

	private Color col; // imports the Color class privately.
	private DConsole d; // imports the DConsole class privately.
	int leftX; // create an int called blockX.
	int leftY; // create an int called blockY.
	int rightX;
	int rightY;

	public Block(DConsole d, int blockX, int blockY, Color col) { // Block method.
		this.leftX = 0; // what is the horiz. loc. of the block?
		this.leftY = 350; // what is the vert. loc. of the block?
		this.rightX = 666;
		this.rightY = 350;
		this.col = new Color(0, 0, 0); // Colour of the block.
		this.d = d; // What console are we using?
	}

	public void moveLeft() {
		if (d.isKeyPressed('w')) {
			if (leftY == 0) {
					leftY++;
			}
				leftY--;	
		}
		if (d.isKeyPressed('s')) {
			if (leftY == 534) {
					leftY--;
			}
				leftY++;
		}

	}

	public void moveRight() {
		if (d.isKeyPressed('[')) {
			if (rightY == 0) {
				rightY++;
			}
				rightY--;		
		}
		if (d.isKeyPressed('\'')) {
			if (rightY == 534) {
				rightY--;
			}
				rightY++;		
		}

	}


	public void drawLeft() { 
		this.d.setPaint(Color.CYAN);
		this.d.fillRect(this.leftX, this.leftY, 30, 60);
	}

	public void drawRight() {
		this.d.setPaint(Color.GREEN);
		this.d.fillRect(this.rightX, this.rightY, 30, 60);
	}

}
