import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Declare/ initialize variables.
		Scanner sc = new Scanner(System.in);
		Player user = new Human();
		Player opponent = null;
		Roshambo opponentValue = null;
		Roshambo userValue;
		String userName;
		boolean contin = true;

		// Prompt user/player to enter name. Validate input.
		System.out.println("Welcome to Rock, Paper, Scissors!");
		userName = Validator.getString(sc, "\nPlease enter your name: ");
		user.setName(userName);

		System.out.println();
			// Prompt user/player to select opponent. Validate input.
			System.out.println("Hello, " + userName + ".");
						
			while (contin) {
				String userOpChoice = Validator.getString(sc, "\nPlease pick an opponent: The Sloppys or The Joes (s/j)\n");
				//System.out.println();

				
			if (userOpChoice.equalsIgnoreCase("s")) {
				opponent = new RockPlayer();
				opponent.setName("The Sloppys");
				opponentValue = opponent.generateRoshambo();
			}

			else if (userOpChoice.equalsIgnoreCase("j")) {
				opponent = new SelectsRndm();
				opponent.setName("The Joes");
				opponentValue = opponent.generateRoshambo();
			}

			else {
				System.out.println("\nInvalid input. Please pick an opponent: The Sloppys or The Joes (s/j)");
				sc.nextLine();
			}
			userValue = user.generateRoshambo();

			System.out.println();
			System.out.println(opponent.getName() + " chose: " + opponentValue);
			System.out.println();

			if (userValue == Roshambo.ROCK) {
				switch (opponentValue) {
				case ROCK:
					System.out.println("It's a tie!");
					break;
				case PAPER:
					System.out.println("You lose!");
					break;
				case SCISSORS:
					System.out.println("You win!");
					break;
				}}
				if (userValue == Roshambo.PAPER) {
					switch (opponentValue) {
					case ROCK:
						System.out.println("You win!");
						break;
					case PAPER:
						System.out.println("It's a tie!");
						break;
					case SCISSORS:
						System.out.println("You lose!");
						break;

					}}
					if (userValue == Roshambo.SCISSORS) {
						switch (opponentValue) {
						case ROCK:
							System.out.println("You lose!");
							break;
						case PAPER:
							System.out.println("You win!");
							break;
						case SCISSORS:
							System.out.println("It's a tie!");
							break;
						}}
					System.out.println();
						System.out.println("Do you want to continue? y/n");
						if (sc.nextLine().equalsIgnoreCase("y")) {
							contin = true;
						}

						else {
							contin = false;
						System.out.println("Thanks for playing!");
					}}
				}
			}
