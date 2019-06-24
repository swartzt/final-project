package javaapplication1;

import DLibX.DConsole;
import java.awt.Color;

public class Ball {

	private Color col; // colour
	private DConsole d; // console
	public int locX; // horiz. loc
	public int locY; // vert. loc
	Block b; // imports the Block class.
	Collisions c; // imports the Collisions class
	boolean collided;

	public Ball(DConsole d, int locX, int locY, Color col) { // ball method.
		this.locX = 300; // locX
		this.locY = 350; // locY
		this.col = Color.RED; // colour of call.
		this.d = d; // console
	}

	public void move() { // creates a move method
		locX--;
		if (locY >= 534) {
			locY--;
		}
		if (locY <= 0) {
			locY++;
		}
		/*
		if (locX >= 696) {
			locX--;
		}
		if (locX <= 0) {
			locX++;
		
		}*/
	}

	public void draw() { // draw the ball.
		this.d.setPaint(this.col); // sets the paint colour
		this.d.fillEllipse(this.locX, this.locY, 30, 30); // draws the ellipse
	}

}