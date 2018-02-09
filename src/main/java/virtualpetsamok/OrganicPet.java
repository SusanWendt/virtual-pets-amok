package virtualpetsamok;

public class OrganicPet extends VirtualPet {

	// instance data
	protected int hunger;
	protected int thirst;
	protected int bathroom;
	protected int energy;

	// constructor 1
	public OrganicPet(String name, String description, int hunger, int thirst, int bathroom, int energy) {
		super(name, description);
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.bathroom = bathroom;
		this.energy = energy;
	}

//	// constructor 2
//	public OrganicPet(String name, String description) {
//		super(name, description);
//		this.hunger = 25;
//		this.thirst = 25;
//		this.bathroom = 25;
//		this.energy = 25;
//	}
	
	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| hunger: " + hunger + "| thirst: " + thirst + "| bathroom: " + bathroom + "| energy:"
				+ energy + "| health: " + health();
	}

	// getters for constructor 1
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBathroom() {
		return bathroom;
	}

	public int getEnergy() {
		return energy;
	}

	// modifier Method
	public void feed(int amountToFeed) {
		hunger = hunger - amountToFeed;
	}

	public void water(int amountToWater) {
		thirst -= amountToWater;
	}

	public void letOut(int amountToLetOut) {
		bathroom -= amountToLetOut;
	}

	public void play(int amountToPlay) {
		energy -= amountToPlay;
	}

	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		bathroom += 5;
		energy += 5;
	}

	@Override
	public String health() {
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && energy >= 50) {
			return "dead";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && energy > 40) {
			return "Bad";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && energy > 30) {
			return "Okay";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && energy > 20) {
			return "Content";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && energy > 10) {
			return "Good";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && energy > 0) {
			return "Great";
		}
		return "Amazing";
	}
}
