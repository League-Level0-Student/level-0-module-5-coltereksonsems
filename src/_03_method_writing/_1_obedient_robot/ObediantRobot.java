package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	public static void main(String[] args) {

		Robot bob = new Robot();
		bob.setSpeed(50);
		bob.penDown();

		String color = JOptionPane.showInputDialog("What color do you want?");
		if (color.equals("red")) {
			bob.setPenColor(Color.red);

		}
		if (color.equals("blue")) {
			bob.setPenColor(Color.blue);
		}
		if (color.equals("yellow")) {
			bob.setPenColor(Color.yellow);
		}
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		if (shape.equals("square")) {
			drawSquare(bob);
		}
		if (shape.equals("triangle")) {
			drawTriangle(bob);
		}
		
		
		
		
		
	}

	static void drawSquare(Robot bob) {
		for (int i = 0; i < 4; i++) {
			bob.move(300);
			bob.turn(90);
		}

	}

	static void drawTriangle(Robot bob) {
		for (int i = 0; i < 3; i++) {
			bob.move(300);
			bob.turn(120);
		}
	}

}
