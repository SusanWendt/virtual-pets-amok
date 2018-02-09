package virtualpetsamok;

public class Dog extends OrganicPet implements Walkable {
	// instance data
	protected int needToWalk;

	// new constructor 
	public Dog(String name, String description, int hunger, int thirst, int bathroom, int energy, int needToWalk) {
		super(name, description, hunger, thirst, bathroom, energy);
		this.needToWalk = needToWalk;
	}
	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| hunger: " + hunger + "| thirst: " + thirst + "| bathroom: " + bathroom + "| energy:"
				+ energy + "| need to walk: " + needToWalk + "| health: " + health();
	}

	@Override
	public int getNeedToWalk() {
		return needToWalk;
	}
	
	@Override
	public void walk(int amountToWalk) {
		needToWalk -= amountToWalk; 
	}
}
