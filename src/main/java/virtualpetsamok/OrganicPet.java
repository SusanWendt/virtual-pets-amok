package virtualpetsamok;

public abstract class OrganicPet extends VirtualPet {

	// instance data
	protected int hunger;
	protected int thirst;
	protected int bathroom;
	protected int boredom;

	// getters
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
		return boredom;
	}

	// modifier Method
	public void feed(int amountToFeed) {
		hunger = hunger - amountToFeed;
	}

	public void water() {
		thirst = -1;
	}

	public void incrThirst() {
		thirst += 1;
	}

	public void letOut() {
		bathroom = -1;
	}

	public void incrBathroom(int amountToIncr) {
		bathroom += amountToIncr;
	}

	@Override
	public void play(int amountToPlay) {
		boredom = -1;
	}

	@Override
	public void tick() {
		super.tick();
		int tickAmnt = 1;
		hunger += tickAmnt;
		thirst += tickAmnt;
		bathroom += tickAmnt;
		boredom += tickAmnt;
	}
}
