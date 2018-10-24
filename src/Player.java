
public abstract class Player {
	private String name; 
	private Roshambo value;

	public Roshambo generateRoshambo() {
		return null;
	}
	
	public Player() {
			}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Roshambo getValue() {
		return value;
	}
	
	public void setValue(Roshambo value) {
		this.value = value;
	}
	
	public Player(String name, Roshambo value) {
		super();
		this.name = name;
		this.value = value;
	}
}
	
