package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		// skills.skill1();
		// skills.skill2();
		// skills.skill3();
		// skills.skill4();
		skills.skill5();
	}

	void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

		String dimes = JOptionPane.showInputDialog(null, "How many Dimes do you have?");

// Tell them how many cents they have (hint multiply by 10)
		int dimes10 = Integer.parseInt(dimes) * 10;
		JOptionPane.showMessageDialog(null, "you have " + (dimes10) + " cents!");

// Ask the user how tall they are (inches)
		String inches = JOptionPane.showInputDialog(null, "How tall are you in inches?");

// If they are shorter than 36 inches, tell them to eat their Wheaties
		int inches2 = Integer.parseInt(inches);
		if (inches2 < 36) {
			JOptionPane.showMessageDialog(null, "Eat Wheaties!");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 1; i < 33; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random generator = new Random();
		int x = generator.nextInt(20);
		System.out.println(x);
// Get another random number that is less than 10 and print it to the console 
		int y = generator.nextInt(10);
		System.out.println(y);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
		// JOptionPane.showMessageDialog(null, "The difference between " + (x) + " and "
		// + (y) + " is " + (x - y));

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String sanDiego = JOptionPane.showInputDialog(null, "What city do you live in?");

// If they answered "San Diego", tell them they live in America's Finest City 
		if (sanDiego.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		}

// Otherwise, tell them to move to San Diego 
		if (!sanDiego.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "Move to Slam Diego!");
		}

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
		int carNum = 3;
// If there is 1 car, use a pop-up to display the make/model of the car 
		if (carNum > 1) {
			JOptionPane.showMessageDialog(null, (carNum) * 4 + " wheels");
		}
// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
		if (carNum == 2) {
			JOptionPane.showMessageDialog(null, "");
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String schoolName = JOptionPane.showInputDialog(null, "What shcool do you attend?");
		if (schoolName.equals("San Elijo Middle School")) {
			schoolName = "SEMS";
		}
// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
		JOptionPane.showMessageDialog(null, schoolName + " is a great school!");
	}
}
