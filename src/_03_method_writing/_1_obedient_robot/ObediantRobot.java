package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	

Robot bob = new Robot();
bob.setSpeed(50);
bob.penDown();
drawTriangle(bob);


}
static void drawSquare(Robot bob) {
	for (int i = 0; i < 4; i++) {
		bob.move(300);
		bob.turn(90);
		}
	
	
	
	
	
}	
	static void drawTriangle (Robot bob) {
		for (int i = 0; i < 3; i++) {
		bob.move(300);
		bob.turn(120);
		}
	}
	
	
	
	
	
	
	
	
	
}
