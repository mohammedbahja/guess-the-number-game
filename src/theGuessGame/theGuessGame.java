package theGuessGame;
import java.util.Scanner;

public class theGuessGame {
	public static void main(String[] args) {
		
		// get ready for the player to use the keyboard
				int guess = -1;
				Scanner scan = new Scanner(System.in);
				// play again string
				String playAgain = "";
				int timePlayed = 0;
				// game loop
				do {
				// create a random number from 1-100
				timePlayed = 0;
				int theNumber = (int)(Math.random()*100 + 1);
				while ( guess != theNumber ) {
					System.out.println("Guess a number between 1 and 100:");
					
					// get the user's guess
					guess = scan.nextInt();
					timePlayed++;
					// add one to the number of tries
					 
					
					if (guess < theNumber)
						System.out.println(guess + " is too low. Try again.");
					else if (guess > theNumber)
						System.out.println(guess + " is too high. Try again.");
					else
						System.out.println(guess + " is correct! You win!" );
					
				}	// end of while loop for guessing
				// ask for 'y' to play again
				System.out.println("You tried "+timePlayed+" times");
				System.out.println("Would you like to play again (y/n)?");
				playAgain = scan.next();
			
			} while(playAgain.equalsIgnoreCase("y"));
			
			// thank the user for playing
			System.out.println("Thank you for playing! Goodbye.");
			
				
	}

}
