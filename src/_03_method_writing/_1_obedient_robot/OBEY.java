package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class OBEY {
	static Robot bob = new Robot();
	public static void drawSquare() {
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
	public static void drawTriangle() {
		bob.penDown();
		bob.setSpeed(50);
		bob.move(250);
		bob.turn(120);
		bob.move(250);
		bob.turn(120);
		bob.move(250);
		bob.turn(120);
	}
	public static void drawCircle() {
		bob.penDown();
		bob.setSpeed(50);
		for(int i = 0; i <= 360; i ++) {
		bob.move(1);
		bob.turn(1);
		}
	}
	public static void main(String[] args) {
		OBEY bobby = new OBEY(); 
		 String question1 = JOptionPane.showInputDialog(null, "What shape would you like me to draw? (square, triangle, or circle)");
		 String question2 = JOptionPane.showInputDialog(null, "What color " + question1 + " would you like me to draw? (red, green, blue, default)");
		 if(question2.equals("red")) {
			bob.setPenColor(Color.red);
		 }else if(question2.equals("green")){
			 bob.setPenColor(Color.green);
		 }else if(question2.equals("blue")) {
			 bob.setPenColor(Color.blue);
		 }else {
			 bob.setPenColor(Color.black);
		 }
		 if(question1.equals("square")) {
			 drawSquare();
		 }else if(question1.equals("triangle")){
			 drawTriangle();
		 }else if(question1.equals("circle")) {
			 drawCircle();
		 }
	}
	
}