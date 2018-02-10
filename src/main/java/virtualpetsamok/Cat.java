package virtualpetsamok;

public class Cat extends OrganicPet {

	private int litterLevel;
	
	public Cat(String name, String description, int hunger, int thirst, int bathroom, int energy, int litterLevel) {
		super(name, description, hunger, thirst, bathroom, energy);
		this.litterLevel = litterLevel; 
	}
	@Override
	public String toString() {
		return name + "\t\t| " + description + "\t\t| " + happiness() + " | Health: " + health() + "|| Hunger: " + hunger + "| Thirst: " + thirst
				+ "| Bathroom: " + bathroom + "| Energy:" + energy + "\t|| Litter Box Dirtiness: " + litterLevel;
	}
	
	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		bathroom += 5;
		energy += 5;
		litterLevel +=5; 
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

	@Override
	protected String health() {
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && energy >= 50 && litterLevel >= 50) {
			return "Dead \t\t\t\t";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && energy > 40 && litterLevel > 40) {
			return "Bad \t\t\t\t";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && energy > 30 && litterLevel > 30) {
			return "Okay \t\t\t";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && energy > 20 && litterLevel > 20) {
			return "Content \t\t\t";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && energy > 10 && litterLevel > 10) {
			return "Good \t\t\t";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && energy > 0 && litterLevel > 0) {
			return "Great \t\t\t";
		}
		return "Amazing \t\t\t";
	}
}
