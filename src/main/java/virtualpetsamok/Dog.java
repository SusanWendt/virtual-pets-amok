package virtualpetsamok;

public class Dog extends OrganicPet implements Walkable {
	// instance data
	private int cageLevel;
	protected int needToWalk;

	// new constructor
	public Dog(String name, String description, int hunger, int thirst, int bathroom, int energy, int needToWalk,
			int cageLevel) {
		super(name, description, hunger, thirst, bathroom, energy);
		this.needToWalk = needToWalk;
		this.cageLevel = cageLevel;
	}

	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| hunger: " + hunger + "| thirst: " + thirst
				+ "| bathroom: " + bathroom + "| energy:" + energy + "| need to walk: " + needToWalk + "| cageLevel: "
				+ cageLevel + "| health: " + health() + "| happiness: " + happiness();
	}

	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		bathroom += 5;
		energy += 5;
		cageLevel += 5;
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
		cageLevel -= amountToClean;
	}

	@Override
	protected String health() {
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && energy >= 50 && cageLevel >= 50) {
			return "Dead";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && energy > 40 && cageLevel > 40) {
			return "Bad";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && energy > 30 && cageLevel > 30) {
			return "Okay";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && energy > 20 && cageLevel > 20) {
			return "Content";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && energy > 10 && cageLevel > 10) {
			return "Good";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && energy > 0 && cageLevel > 0) {
			return "Great";
		}
		return "Amazing";
	}

}
