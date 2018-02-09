package virtualpetsamok;

public class RoboticPet extends VirtualPet {
	// instance data
	protected int rust;

	// new constructor
	public RoboticPet(String name, String description, int rust) {
		super(name, description);
		this.rust = rust;
	}
	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| rust: " + rust + "| health: " + health();
	}
	
	// getters for constructor 1
	public int getRust() {
		return rust;
	}
	
	// robotic class specific methods
	public void oil(int amountToOil) {
		rust -= amountToOil; 
	}
	
	//overridden methods 
	@Override
	public void tick() {
		rust += 5;
	}

	@Override
	public String health() {
		if (rust >= 50 ) {
			return "critical oil need reached";
		}
		if (rust >= 40 ) {
			return "really really needs oil";
		}
		if (rust >= 30 ) {
			return "really needs oil";
		}
		if (rust >= 20 ) {
			return "kinda needs oil";
		}
		if (rust >= 10 ) {
			return "oil would be nice";
		}
		if (rust > 0 ) {
			return "oil is a treat";
		}
		return "oil full";
	}

}
