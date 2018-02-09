package virtualpetsamok;

public class Dog extends OrganicPet {
	// instance data
	private int needToWalk;

	// new constructor 
	public Dog(String name, String description, int hunger, int thirst, int bathroom, int energy, int needToWalk) {
		super(name, description, hunger, thirst, bathroom, energy);
		this.needToWalk = needToWalk;
	}
	
	// dog class specific methods
	public void walk(int amountToWalk) {
		needToWalk -= amountToWalk; 
	}

}
