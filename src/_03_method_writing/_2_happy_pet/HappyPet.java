package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petSpecies = JOptionPane.showInputDialog("What kind of pet do you want?"); 
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (true) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to increase your pet's happiness?", "Task chooser", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take pet out for a walk", "Make pet some food", "Play with pet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	walk ();
}
if (task == 1) {
	food();
}
if (task == 2) {
	play();
}
// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
 if (happinessLevel == 6) {
	 JOptionPane.showInputDialog("You love your pet!"); 
	 break;
}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	
	static void walk() {
		JOptionPane.showMessageDialog (null, "you took your pet for a walk");
		happinessLevel +=1;
	}
	static void food() {
		JOptionPane.showMessageDialog (null, "you fed your pet");
		happinessLevel +=1;
	}
	static void play() {
		JOptionPane.showMessageDialog (null, "you played with your pet");
		happinessLevel +=1;
	}
	
	
	
}