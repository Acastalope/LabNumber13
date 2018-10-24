import java.util.Scanner;
public class RoshamboApp {

	public static void main(String[] args) {
		// Declare/ initialize variables.
		Scanner sc = new Scanner(System.in);
		Player user = new Human();
		Player opponent;
		Roshambo opponentValue;
		String userName;
		
		// Prompt user/player to enter name. Validate input.
		System.out.println("Welcome to Rock, Paper, Scissors!");
		userName = Validator.getString(sc, "\nPlease enter your name: ");
		user.setName(userName);
		
		// Prompt user/player to select opponent. Validate input.
		String userOpChoice = Validator.getString(sc, "\nHello, " + userName + ". " + "Please pick an opponent: The Sloppys or The Joes (s/j)");
		
					
		if (userOpChoice.equalsIgnoreCase("s")) {
			opponent = new RockPlayer();
			//break;
		}
		
		else if (userOpChoice.equalsIgnoreCase("j")) {
			opponent = new SelectsRndm();
			}
		
		else {
		System.out.println("\nInvalid input. Please pick an opponent: The Sloppys or The Joes (s/j)");
		sc.nextLine();
		}
		
		// Prompt user/player to select rock, paper, or scissors. Validate input. Display user/player's choice.
		String userWpChoice = Validator.getString(sc, "\nChoose your weapon: Rock, Paper, or Scissors? (R/P/S)");
		
		if (userWpChoice.equalsIgnoreCase("R")) {
			System.out.println("You chose: Rock");
			
		if (userWpChoice.equalsIgnoreCase("P")) {
				System.out.println("You chose: Paper");
				
		if (userWpChoice.equalsIgnoreCase("S")) {
					System.out.println("You chose: Scissors");
								
		// Display opponent's choice of rock, paper, or scissors. Validate input. Display user/opponent's choice. 
		// I unfortunately don't know how to get the opponent to generate input.
		
		// Display results of match. Write a separate method.
		
		// Prompt user to choose if they want to continue or not. Validate input.
					}
	}
}
}
	}	
