package theGuessGame;

import java.util.Scanner;

public class theGuessGame {
	public static void main(String[] args) {
		
		// get ready for the player to use the keyboard
				Scanner scan = new Scanner(System.in);
				
				// play again string
				String playAgain = "";
				
				// game loop
				do {
				// create a random number from 1-100
				int theNumber = (int)(Math.random()*100 + 1);
				int guess = 0;
				int tries = 0;
				while ( guess != theNumber ) {
					System.out.println("Guess a number between 1 and 100:");
					
					// get the user's guess
					guess = scan.nextInt();
					tries ++;
					if (guess < theNumber) {
						System.out.println(guess + " is too low. Try again.");
					
					}
					else if (guess > theNumber) {
						System.out.println(guess + " is too high. Try again.");
					
					}
					else
						System.out.println(guess + " is correct! You win!" );
					
				}
				
				
                // add one to the number of tries
               if (tries == 1) {
                   System.out.println("Good job. You guessed it in 1 try.");
               } else {
                   System.out.println("Good job. You guessed it in " + tries
                                           + " tries.");
               }
				// end of while loop for guessing
				// ask for 'y' to play again
				System.out.println("Would you like to play again (y/n)?");
				playAgain = scan.next();
			
			} while(playAgain.equalsIgnoreCase("y"));
			
			// thank the user for playing
			System.out.println("Thank you for playing! Goodbye.");
			
				
	}

}
