package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class OBEY {
	Robot bob = new Robot();
	public void drawSquare() {
		bob.penDown();
		bob.setSpeed(50);
		bob.move(250);
		bob.turn(90);
		bob.move(250);
		bob.turn(90);
		bob.move(250);
		bob.turn(90);
		bob.move(250);
		bob.turn(90);	
	}
	public void drawTriangle() {
		bob.penDown();
		bob.setSpeed(50);
		bob.move(250);
		bob.turn(120);
		bob.move(250);
		bob.turn(120);
		bob.move(250);
		bob.turn(120);
	}
	public void drawCircle() {
		bob.penDown();
		bob.setSpeed(50);
		for(int i = 0; i <= 360; i ++) {
		bob.move(1);
		bob.turn(1);
		}
	}
	public static void main(String[] args) {
		OBEY bobby = new OBEY();
		bobby.drawCircle();
	}
}