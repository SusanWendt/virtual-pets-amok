package virtualpetsamok;

public class Cat extends OrganicPet {

	LitterBox shelterLitterBox = new LitterBox(50);

	public Cat(String name, String description, int hunger, int thirst, int bathroom, int energy) {
	}

	public Cat(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 20;
		this.thirst = 20;
		this.bathroom = 20;
		this.energy = 20;
	}

	@Override
	public String toString() {
		return name + "\t\t| " + description + "\t\t| " + happiness() + " | Health: " + health() + "|| Hunger: "
				+ hunger + "| Thirst: " + thirst + "| Bathroom: " + bathroom + "| Energy:" + energy;
	}

	@Override
	public void tick() {
		hunger += 5;
		thirst += 5;
		bathroom += 5;
		energy += 5;
	}

	@Override
	protected String health() {
		if (hunger >= 50 && thirst >= 50 && bathroom >= 50 && energy >= 50 && shelterLitterBox.getSoilLevel() >= 50) {
			return "Dead \t\t\t\t";
		}
		if (hunger > 40 && thirst > 40 && bathroom > 40 && energy > 40 && shelterLitterBox.getSoilLevel() > 40) {
			return "Bad \t\t\t\t";
		}
		if (hunger > 30 && thirst > 30 && bathroom > 30 && energy > 30 && shelterLitterBox.getSoilLevel() > 30) {
			return "Okay \t\t\t";
		}
		if (hunger > 20 && thirst > 20 && bathroom > 20 && energy > 20 && shelterLitterBox.getSoilLevel() > 20) {
			return "Content \t\t\t";
		}
		if (hunger > 10 && thirst > 10 && bathroom > 10 && energy > 10 && shelterLitterBox.getSoilLevel() > 10) {
			return "Good \t\t\t";
		}
		if (hunger > 0 && thirst > 0 && bathroom > 0 && energy > 0 && shelterLitterBox.getSoilLevel() > 0) {
			return "Great \t\t\t";
		}
		return "Amazing \t\t\t";
	}
}
