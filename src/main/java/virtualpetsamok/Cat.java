package virtualpetsamok;

public class Cat extends OrganicPet {

	private int litterLevel;
	
	public Cat(String name, String description, int hunger, int thirst, int bathroom, int energy, int litterLevel) {
		super(name, description, hunger, thirst, bathroom, energy);
		this.litterLevel = litterLevel; 
	}
	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| hunger: " + hunger + "| thirst: " + thirst + "| bathroom: " + bathroom + "| energy:"
				+ energy + "| litterlevel: " + litterLevel + "| health: " + health();
	}
	public int getLitterLevel() {
		return litterLevel;
	}
	public void cleanCatLitterBox(int amountToClean) {
		litterLevel -= amountToClean;
	}

	public void incrLitterLevel(int i) {
		litterLevel += 5; 
		
	}
}
