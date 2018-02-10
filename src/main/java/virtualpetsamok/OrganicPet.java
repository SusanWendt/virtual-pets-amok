package virtualpetsamok;

public abstract class OrganicPet extends VirtualPet {

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
}
