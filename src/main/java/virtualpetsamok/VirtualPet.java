package virtualpetsamok;

public abstract class VirtualPet {

	// protected String status for abstract class;
	protected String name;
	protected String description;
	protected String happiness; 
	protected int health;

	// getters
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getHappiness() {
		return happiness;
	}

	protected abstract String health();

	public String happiness() {
		if (health().equals("Dead") || health().equals("Bad") || health().equals("Okay")) {
			return "Unhappy \t";
		}
		if (health().equals("critical oil level reached") || health().equals("really really needs oil")
				|| (health().equals("really needs oil"))) {
			return "Unhappy \t";
		}
		return "Happy \t";
	}

	public void tick() {
		int tickAmnt = 1; 
		health += tickAmnt; 
		happiness += tickAmnt;
	}

	public void play(int amountToPlay) {

	}
}
