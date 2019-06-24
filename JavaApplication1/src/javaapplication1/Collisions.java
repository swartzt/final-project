package javaapplication1;

import DLibX.DConsole;

public class Collisions {

	DConsole dc;

	private Block block; // access the Block class, name it block
	private Ball ball; // "" ball class -- "ball"

	public Collisions(Block block, Ball ball) {
		this.block = block;
		this.ball = ball;
	}

	public void onCollide() { // do what when the ball collides
		boolean rightHit = false;
		boolean leftHit = false;
		boolean topHit = false;
		boolean bottomHit = false;

		if (ball.getLocX() <= block.leftX + 30
				&& (ball.getLocY() >= block.leftY && ball.getLocY() <= block.leftY + 60)) {  // 
			ball.velX *= -1;
			ball.velY *= -1;
		}

		if (ball.getLocX() + 30 >= block.rightX  && (ball.getLocY() >= block.rightY && ball.getLocY() <= block.rightY + 60)) { 																																																			// paddle...
			ball.velX *= -1;
			ball.velY *= -1;
		}
		if (leftHit == true) { // when the ball hits the left paddle
			ball.velX *= -1; // reverse direction x
			ball.velY *= -1; // "" y
		}
		if (rightHit == true) { // when it hits the right
			ball.velX *= -1; // "" 
			ball.velY *= -1; // ""
		}
		if (ball.getLocY() <= 0) { // when it hits the top
			topHit = true;
		}
		if (ball.getLocY() >= 564) { // when it hits the bottom
			bottomHit = true;
		}
	}

}