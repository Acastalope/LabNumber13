
public class SelectsRndm extends Player {

	@Override
	public Roshambo generateRoshambo() {
		int randNum = (int) (Math.random() *3);
		System.out.println(randNum);
		switch(randNum) {
		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
			default:
		return null;

	}
}
}
