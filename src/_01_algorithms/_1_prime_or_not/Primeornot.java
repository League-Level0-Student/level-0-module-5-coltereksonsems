package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prime =JOptionPane.showInputDialog("Please enter a number");
		int number=Integer.parseInt(prime);
		
		for (int i = 2; i < number; i++) {
			if (number % i ==0) {
				JOptionPane.showMessageDialog(null,"This number is not prime.");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null,"This number is prime.");
		
		
		
		
		
		
		
		
		
	}

}
