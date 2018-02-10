package virtualpetsamok;

public class Dog extends OrganicPet implements Walkable {
	// instance data
	private int cageLevel;
	protected int needToWalk;

	// new constructor
	public Dog(String name, String description, int hunger, int thirst, int bathroom, int energy, int needToWalk, int cageLevel) {
		super(name, description, hunger, thirst, bathroom, energy);
		this.needToWalk = needToWalk;
		this.cageLevel = cageLevel; 
	}

	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| hunger: " + hunger + "| thirst: " + thirst
				+ "| bathroom: " + bathroom + "| energy:" + energy + "| need to walk: " + needToWalk + "| cageLevel: " + cageLevel + "| health: "
				+ health();
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
}
