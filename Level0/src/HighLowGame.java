

import java.util.Random;

import javax.swing.JOptionPane;

//Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 9; i >0; i--) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100. You have ten rounds");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int userAnswer=Integer.parseInt(guess);
			// 5. if the guess is correct
				if (userAnswer==random) {
					JOptionPane.showMessageDialog(null, "You win");
					System.exit(0);
				}
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
				if (userAnswer>random) {
					JOptionPane.showMessageDialog(null, "Your guess was too high. You have "+ i + " tries left");
				}
			// 9. if the guess is low
				// 10. tell them it's too low
				if (userAnswer<random) {
					JOptionPane.showMessageDialog(null, "Your answer was too low");
				}
		// 12. tell them they lose
		}	
		JOptionPane.showMessageDialog(null, "You lose");

	}

}

