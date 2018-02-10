package virtualpetsamok;

public abstract class RoboticPet extends VirtualPet {

	// instance data
	protected int rust;
	protected int battery;

	// new constructor
	public RoboticPet(String name, String description, int rust, int battery) {
		super(name, description);
		this.rust = rust;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return name + "\t| " + description + "\t| " + happiness() + " | Health: " + health() + "|| Rust: " + rust + "| Battery: " + battery ;
	}

	// getters for constructor 1
	public int getRust() {
		return rust;
	}

	// robotic class specific methods
	public void oil(int amountToOil) {
		rust -= amountToOil;
	}

	// overridden methods
	@Override
	public void tick() {
		rust += 5;
	}

	@Override
	public String health() {
		if (rust >= 50) {
			return "critical oil level reached\t";
		}
		if (rust >= 40) {
			return "really really needs oil \t";
		}
		if (rust >= 30) {
			return "really needs oil \t\t";
		}
		if (rust >= 20) {
			return "kinda needs oil \t\t";
		}
		if (rust >= 10) {
			return "oil would be nice \t\t";
		}
		if (rust > 0) {
			return "oil is a treat \t\t";
		}
		return "oil full \t\t\t";
	}

	@Override
	public void play(int amountToPlay) {
		battery -= amountToPlay;		
	}
}
