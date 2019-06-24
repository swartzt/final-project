package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Ball implements Drawable { // implements the Drawable interface 

	private Color col; // colour
	DConsole dc;
	private float locX; // horiz. loc
	private float locY; // vert. loc
	float velX = 2;
	float velY = 2;
	Block b; // imports the Block class.
	Collisions c; // imports the Collisions class

	public Ball(DConsole dc, int locX, int locY, Color col) { // ball method.
		this.locX = 300; // locX
		this.locY = 250; // locY
		this.col = Color.RED; // colour of call.
		this.dc = dc; // console
	}

	public void move() { // creates a move method
		
		if (this.locY <= 0 || this.locY >= 564) { // stop the ball from going out of bounds
			this.velY *= -1;
		}
		this.locY += velY;

		if (this.locX >= 696 || this.locX <= 0) { // stop it from going out of bounds
			this.velX *= -1;
		}
		this.locX += velX;

	}

	public void draw() { // method to draw the ball
		this.dc.setPaint(this.col); // sets the paint colour
		this.dc.fillEllipse(this.locX, this.locY, 30, 30); // draws the ellipse
	}
	
	public float getLocX() { // get the locX
		return locX;
	}
	
	public float getLocY() { // get the y loc
		return locY; 
	}

}