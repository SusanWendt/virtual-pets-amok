package virtualpetsamok;

public class Dog extends OrganicPet implements Walkable {
	// instance data
	private int cageLevel;
	protected int needToWalk;

	// new constructor
	public Dog(String name, String description, int hunger, int thirst, int bathroom, int energy, int needToWalk,
			int cageLevel) {
		this.needToWalk = needToWalk;
		this.cageLevel = cageLevel;
	}

	public Dog(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 10;
		this.thirst = 10;
		this.bathroom = 10;
		this.energy = 10;
		this.needToWalk = 10;
		this.cageLevel = 10;
	}

	@Override
	public String toString() {
		return name + "\t\t| " + description + "\t\t| " + happiness() + " | Health: " + health() + "|| Hunger: "
				+ hunger + "| Thirst: " + thirst + "| Bathroom: " + bathroom + "| Energy:" + energy
				+ "\t|| Need to Walk: " + needToWalk + "|| Cage Dirtiness: " + cageLevel;
	}

	@Override
	public void tick() {
		int ticker = 5;
		super.tick();
		cageLevel += ticker;
	}

	@Override
	public int getNeedToWalk() {
		return needToWalk;
	}

	@Override
	public void walk(int amountToWalk) {
		needToWalk -= amountToWalk;
	}

	public int getCageLevel() {
		return cageLevel;
	}

	public void cleanDogCage(int amountToClean) {
		cageLevel = 0;
	}

	@Override
	protected String health() {
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && energy >= 50 && cageLevel >= 50) {
			return "Dead \t\t\t";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && energy > 40 && cageLevel > 40) {
			return "Bad \t\t\t\t";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && energy > 30 && cageLevel > 30) {
			return "Okay \t\t\t";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && energy > 20 && cageLevel > 20) {
			return "Content \t\t\t";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && energy > 10 && cageLevel > 10) {
			return "Good \t\t\t";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && energy > 0 && cageLevel > 0) {
			return "Great \t\t\t";
		}
		return "Amazing";
	}

}
