package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Block {
	
	private DConsole d; // imports the DConsole class privately.
	private Color col; // imports the Color class privately.
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

	public void moveLeft() { // a method that controls the left paddle
		if (d.isKeyPressed('w')) { // if we press the w key what does it do
			if (leftY == 0) { // if you press the w key but it's at the top, move it down.
					leftY++;
			}
				leftY--;	// move it "up"
		}
		if (d.isKeyPressed('s')) { // when you press the s key do what
			if (leftY == 534) { // if you press the s key and it's at the bottom do what
					leftY--; // moves it "up"
			}
				leftY++; // moves it "down"
		} // bracket

	}

	public void moveRight() { // controls the right paddle
		if (d.isKeyPressed('[')) { // [ is the key that moves it up
			if (rightY == 0) {
				rightY++; 
			}
				rightY--;		
		}
		if (d.isKeyPressed('\'')) { // makes ' as the key to move it down
			if (rightY == 534) {
				rightY--;
			}
				rightY++;		
		}

	}


	public void drawLeft() {  // draws the left paddle
		this.d.setPaint(Color.YELLOW); // what colour is the paddle
		this.d.fillRect(this.leftX, this.leftY, 30, 60);
	}

	public void drawRight() { // draws the right paddle
		this.d.setPaint(Color.YELLOW); // what colour is the paddle
		this.d.fillRect(this.rightX, this.rightY, 30, 60);
	}

}
