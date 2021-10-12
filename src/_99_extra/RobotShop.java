package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotShop {

	public static void main(String[] args) {
	String points =	JOptionPane.showInputDialog("how many sideds do you want your shape to have?");
	int sides = Integer.parseInt (points);
	
Robot bob = new Robot();
bob.setSpeed(100);
 bob.penDown();
	
for (int i = 0; i < sides; i++) {
	bob.turn(360/sides);
	bob.move(100);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
