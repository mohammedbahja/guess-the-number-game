package theGuessGame;
import java.util.Scanner;

public class theGuessGame {
	public static void main(String[] args) {
		
		// get ready for the player to use the keyboard
				Scanner scan = new Scanner(System.in);
				
				// play again string
				String playAgain = "";
				// create a random number from 1-100
				int theNumber = (int)(Math.random()*100 + 1);
				while ( guess != theNumber ) {
					System.out.println("Guess a number between 1 and 100:");
					
					// get the user's guess
					guess = scan.nextInt();
					
					// add one to the number of tries
					 
					
					if (guess < theNumber)
						System.out.println(guess + " is too low. Try again.");
					else if (guess > theNumber)
						System.out.println(guess + " is too high. Try again.");
					else
						System.out.println(guess + " is correct! You win!" );
					
				}	// end of while loop for guessing
				
	}

}
