import java.util.Scanner;
public class Human extends Player {

private Scanner sc;

	@Override
	public Roshambo generateRoshambo() {
		sc = new Scanner(System.in);
		System.out.println();
		String userInput = Validator.getString (sc,  "Rock, paper, or scissors? (R/P/S)\n");
		if (userInput.equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
			} else if (userInput.equalsIgnoreCase("P")) {
				return Roshambo.PAPER;
			} else if (userInput.equalsIgnoreCase("S")) {
				return Roshambo.SCISSORS;
			} else {
		return generateRoshambo();
	}
}
}