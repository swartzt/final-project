package javaapplication1;

import DLibX.DConsole;

public class Collisions {

	DConsole dc;
	int points = 0; // points int

	private Block block;
	private Ball ball;
	
	public boolean sameRightX;
	public boolean sameRightY;
	public boolean sameLeftX;
	public boolean sameLeftY;
	public boolean collided;

	public Collisions(Block block, Ball ball) {
	    this.block = block;
	    this.ball = ball; 
	}
	 

	public void onCollide() {
		if(ball.locX == block.leftX) {
			sameLeftX = true;
		}
		if(ball.locY == block.leftY) {
			sameLeftY = true;
		}
		if(ball.locX == block.rightX) {
			sameRightX = true;
		}
		if(ball.locY == block.rightY) {
			sameRightY = true;
		}
		if(sameLeftX = true) {
			ball.locX++;
		}
		if(sameRightX = true) {
			ball.locX--;
		}
	}
	
	
	

}