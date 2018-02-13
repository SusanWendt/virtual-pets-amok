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
	public void feed() {
		hunger = 0;
	}

	public void water() {
		thirst = 0;
	}

	public void incrThirst() {
		thirst++;
	}

	public void letOut() {
		bathroom = 0;
	}

	public void incrBathroom() {
		bathroom++;
	}

	@Override
	public void play() {
		boredom = 0;
	}

	@Override
	public void tick() {
		int tickAmnt = 1;
		hunger += tickAmnt;
		thirst += tickAmnt;
		bathroom += tickAmnt;
		boredom += tickAmnt;
	}
}
